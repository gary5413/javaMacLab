import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1805 extends JPanel implements ActionListener {

  JTextField txt = new JTextField("0");
  double number =0;     // 用來記錄第一個數字
  boolean input = false;
  String op;

  public static void main(String[] args) {
    Pgm_1805 p = new Pgm_1805();
    JFrame f = new JFrame();
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,320);
    f.setVisible(true);
  }

  public Pgm_1805() {
    setLayout(new BorderLayout());
    add(txt, BorderLayout.NORTH);

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(4,4));      // 設定 4x4 的空間來放置
                                           // 數字及運算符號的按鈕
    String buttons = "789+456-123*.0=/";   // 用來建立每個按鈕的字串
    for (int i=0;i<buttons.length();i++) {
      JButton b = new JButton(buttons.substring(i,i+1));  // 每次取一個字來建立按鈕
      p.add(b);
      b.addActionListener(this);
    }
    add(p,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    String buttons = "0123456789.+*-/"; // 用來簡化判斷式的字串

    if (buttons.indexOf(s) == -1) {     // 使用者按下等號
      switch(buttons.indexOf(op)) {
          case 11:
            number += Double.parseDouble(txt.getText());
            break;
          case 12:
            number *= Double.parseDouble(txt.getText());
            break;
          case 13:
            number -= Double.parseDouble(txt.getText());
            break;
          case 14:
            number /= Double.parseDouble(txt.getText());
            break;
      }
      txt.setText(Double.toString(number));
      input = false;
    }
    else if (buttons.indexOf(s)<11) {   // 使用者按下數字按鈕
      if (input)
        txt.setText(txt.getText()+s);   // 若已開始輸入, 就將新數字加到最後面
      else {
        input=true;
        txt.setText(s);
      }
    }
    else                // 其它狀況 (使用者按下 +*-/)
    {
      op = s;           // 將運算符號記錄起來
      number = Double.parseDouble(txt.getText());
      input = false;
    }
  }
}
