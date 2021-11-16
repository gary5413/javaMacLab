import java.awt.event.*;
import javax.swing.*;

public class EX18_10 extends JFrame {
  public static void main(String[] args) {
    EX18_10 f = new EX18_10();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(240,240);
    f.setVisible(true);
  }

  public EX18_10() {
    JButton hello = new JButton("Hello");
    getContentPane().add(hello);
    hello.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    setTitle("Hello World");
  }
}

