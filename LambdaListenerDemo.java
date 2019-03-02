import javax.swing.*;
import java.awt.event.*;

public class LambdaListenerDemo extends JFrame {
  public LambdaListenerDemo() {
    // Create four buttons
    JButton jbtNew = new JButton("New");
    JButton jbtOpen = new JButton("Open");
    JButton jbtSave = new JButton("Save");
    JButton jbtPrint = new JButton("Print");

    // Create a panel to hold buttons
    JPanel panel = new JPanel();
    panel.add(jbtNew);
    panel.add(jbtOpen);
    panel.add(jbtSave);
    panel.add(jbtPrint);
    
    add(panel);

    // Create and register listener using Lambda expression
    jbtNew.addActionListener((ActionEvent e) -> {
      System.out.println("Process New");
    });

    jbtOpen.addActionListener((e) -> {
      System.out.println("Process Open");
    });
    
    jbtSave.addActionListener(e -> {
      System.out.println("Process Save");
    });
    
    jbtPrint.addActionListener
      (e -> System.out.println("Process Print"));
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new LambdaListenerDemo();
    frame.setTitle("LambdaListenerDemo");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
