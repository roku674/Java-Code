package Week2;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	
	public StackOfIntegers(){
		this(16);
	}
	
	public StackOfIntegers (int cap){
		this.elements = new int[cap];
		this.size = 0;
	}
	
	public boolean empty(){
		if(size==0)
			return true;
		else 
			return false;
	}
	
	public int peek() {	
		return size;
	}
	
	/**public int push(int value){
		if (elements.length <= size)
			return value;
		else
			elements[size]
	}**/
	
	public int pop(){
		
		return size;
	}
	
	public int getSize() {
		return size;
	}
  /**public void doStuff(){
	  
	  StackOfIntegers s = new StackOfIntegers();
	  while(s.getSize()< 16){
		  s.push(10);
	  }
	  while(s.empty() != false){
		  System.out.print(s.pop());
	  }
  }**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
