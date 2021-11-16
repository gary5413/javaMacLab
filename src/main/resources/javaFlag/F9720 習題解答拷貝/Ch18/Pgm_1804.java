import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pgm_1804 extends KeyAdapter
                      implements ActionListener {
  JFrame f = new JFrame("計算三角函數");
  JTextField degree = new JTextField();

  JTextField sintxt = new JTextField();
  JTextField costxt = new JTextField();
  JTextField tantxt = new JTextField();
  JLabel sinlab =new JLabel(" SIN() ");
  JLabel coslab =new JLabel(" COS() ");
  JLabel tanlab =new JLabel(" TAN() ");

  JButton go = new JButton("計算");
  double convert = 180 / Math.PI;  // 一弳度等於 (180/π) 度

  public static void main(String[] args) {
    Pgm_1804 tri = new Pgm_1804();
    tri.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    // 將兩個元件及 JPanel 加入 JFrame
    contentPane.add(p1,"North");
    contentPane.add(p2,"Center");
    contentPane.add(go,"South");

    // 將 JPanel 設定為使用 GridLayout (2 列、1 行)
    p1.setLayout(new GridLayout(2,1));
    p1.add(buildMenu());
    p1.add(degree);

    // 將 JPanel 設定為使用 GridLayout (3 列、2 行)
    p2.setLayout(new GridLayout(3,2));
    p2.add(sinlab);   p2.add(sintxt);
    p2.add(coslab);   p2.add(costxt);
    p2.add(tanlab);   p2.add(tantxt);

    go.addActionListener(this);
    degree.addKeyListener(this);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,240);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    calc();
  }

  // 在輸入區按 ENTER 鍵也會進行計算
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_ENTER) calc();
  }

  public void calc() {
    try {
      // 取得輸入區的字串, 轉成浮點數後除以角度換算單位
      double theta = Double.parseDouble(degree.getText())/convert;
      // 計算三角函數值, 並將結果寫到各文字欄位中
      sintxt.setText(Double.toString(Math.sin(theta)));
      costxt.setText(Double.toString(Math.cos(theta)));
      tantxt.setText(Double.toString(Math.tan(theta)));
    } catch (NumberFormatException e) {
      degree.setText("");   // 發生例外時清除輸入區內容
    }
  }

  // 建立功能表內容的方法
  public JMenuBar buildMenu() {
    JMenuBar mbar = new JMenuBar();
    JMenu menu = new JMenu("設定單位");
    mbar.add(menu);

    ButtonGroup group = new ButtonGroup();

    // 角度
    JMenuItem item = new JCheckBoxMenuItem("角度", true);
    item.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 180 / Math.PI;
      }
    });
    menu.add(item);
    group.add(item); // 將兩個功能表項目設為一組

    // 弳度
    item = new JCheckBoxMenuItem("弳度", false);
    item.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 1;
      }
    });
    menu.add(item);
    group.add(item); // 將兩個功能表項目設為一組

    return mbar;
  }
}
