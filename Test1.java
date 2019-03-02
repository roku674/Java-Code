import java.util.concurrent.*;

public class Test1  {
  private Quiz quiz = new Quiz();
  
  public static void main(String[] args) {
    new Test1();
  }
  
  public Test1() {
    ExecutorService executor = Executors.newCachedThreadPool();

    // Create and launch 5 threads
    for (int i = 0; i < 5; i++) {
      executor.execute(new TakeQuiz());
    }

    executor.shutdown();

    // Wait until all tasks are finished
    while (!executor.isTerminated()) {
    }
  }
  
  public class TakeQuiz implements Runnable {
    public void run() {
      quiz.increaseCount(20);
    }
  }
  
  public static class Quiz {
    private int correctCount;
    
    // Note that the method is now synchronized!!!
    public synchronized void increaseCount(int times) {
      correctCount = 0;
      for (int i = 0; i < times; i++) {
        correctCount++;
        
        // This delay is deliberately added to magnify the
        // data-corruption problem and make it easy to see.
        try {
          Thread.sleep(15);
        }
        catch (InterruptedException ex) {
        }
      }
      
      System.out.println("Count is " + correctCount);
    }
  }
}