import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1802 {

  JFrame myframe = new JFrame("猜數字大小");
  JTextField stage = new JTextField();  // 顯示目前在第幾關
  JButton smaller = new JButton("比7小");
  JButton bigger = new JButton("比7大");
  int count = 0;      // 記錄玩到第幾關
  int secret=7;       // 隨機數字

  public static void main(String[] args) {
    Pgm_1802 test = new Pgm_1802();
  }

  public Pgm_1802() {
    // 先取得 ContentPane 物件
    Container contentPane = myframe.getContentPane();

    // 將 5 個元件加到 BorderLayout 的五個位置
    contentPane.add(buildMenu(),BorderLayout.NORTH);
    contentPane.add(smaller,BorderLayout.EAST);
    contentPane.add(bigger,BorderLayout.WEST);
    contentPane.add(new JLabel("　　　？"),BorderLayout.CENTER);
    contentPane.add(stage,BorderLayout.SOUTH);
    newsecret();

    // 猜比７小
    smaller.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if ( Math.max(7,secret) == 7)
            newsecret();
          else
            failed();
        }
      }
    );

    // 猜比７大
    bigger.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (Math.min(7,secret) == 7)
            newsecret();
          else
            failed();
        }
      }
    );

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(240,120);
    myframe.setVisible(true);
  }

  // 建立功能表內容的方法
  public JMenuBar buildMenu() {
    JMenuBar mbar = new JMenuBar();
    JMenu menu = new JMenu("程式 (P)");
    menu.setMnemonic(KeyEvent.VK_P);
    mbar.add(menu);

    // 開始新遊戲
    JMenuItem item = new JMenuItem("新遊戲 (N)", KeyEvent.VK_N);
    item.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        newgame();
      }
    });
    menu.add(item);

    // 結束程式
    item = new JMenuItem("結束 (X)", KeyEvent.VK_X);
    item.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    menu.add(item);

    return mbar;
  }

  // 產生新亂數
  public void newsecret() {
    if (count++==5) {
      stage.setText("過五關！你贏了。");
      stop();
    }
    else {
      stage.setText("第"+count+"關");
      do {
        secret = (int) (Math.random() * 13 + 1);
      } while (secret == 7); // 讓隨機數字不會等於7
    }
  }

  public void failed() {
    stage.setText("猜錯了！神秘數字是"+secret+"。您玩到第"+count+"關");
    stop();
  }

  // 停止遊戲
  public void stop() {
    bigger.setEnabled(false);
    smaller.setEnabled(false);
  }

  // 開始新遊戲
  public void newgame() {
    count=0;
    newsecret();
    bigger.setEnabled(true);
    smaller.setEnabled(true);
  }
}
