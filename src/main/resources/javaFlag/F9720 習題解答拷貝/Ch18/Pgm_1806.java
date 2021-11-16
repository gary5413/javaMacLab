import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pgm_1806 extends JPanel implements ActionListener {
  JFrame f = new JFrame("用JColorChooser選擇顏色");
  Color c = Color.WHITE;

  public static void main(String[] args) {
    Pgm_1806 test = new Pgm_1806();
    test.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    contentPane.add(this,"Center");

    JButton chooseColor = new JButton("選擇顏色");
    chooseColor.addActionListener(this);
    contentPane.add(chooseColor,"North");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,240);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    // 顯示選擇顏色交談窗
    c=(new JColorChooser()).showDialog(f,"選擇顏色",Color.WHITE);

    // 若使用者有選擇顏色
    if (c!=null)
      setBackground (c);
  }
}

