import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1801 {

  JFrame myframe = new JFrame("重量轉換");
  JTextField result = new JTextField();  // 轉換結果顯示區
  JTextField weight = new JTextField();  // 輸入區
  JButton k2p = new JButton("公斤轉英磅");
  JButton p2k = new JButton("英磅轉公斤");

  public static void main(String[] args) {
    Pgm_1801 test = new Pgm_1801();
  }

  public Pgm_1801() {
    // 先取得 ContentPane 物件
    Container contentPane = myframe.getContentPane();

    // 將 5 個元件加到 BorderLayout 的五個位置
    contentPane.add(new JLabel("請輸入重量, 再按左邊或右邊的按鈕"),BorderLayout.NORTH);
    contentPane.add(k2p,BorderLayout.EAST);
    contentPane.add(p2k,BorderLayout.WEST);
    contentPane.add(weight,BorderLayout.CENTER);
    contentPane.add(result,BorderLayout.SOUTH);

    // 公斤轉英磅按鈕的 ActionListener()
    k2p.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            double k = Double.parseDouble(weight.getText());
            result.setText(k + " 公斤等於 " + k*2.203 + " 英磅");
          } catch (NumberFormatException ne) {
            weight.setText("");   // 發生例外時清除輸入區內容
          }
        }
      }
    );

    // 英磅轉公斤按鈕的 ActionListener()
    p2k.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            double p = Double.parseDouble(weight.getText());
            result.setText(p + " 英磅等於 " + p*0.454 + " 公斤");
          } catch (NumberFormatException ne) {
            weight.setText("");   // 發生例外時清除輸入區內容
          }
        }
      }
    );

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(400,120);
    myframe.setVisible(true);
  }
}

