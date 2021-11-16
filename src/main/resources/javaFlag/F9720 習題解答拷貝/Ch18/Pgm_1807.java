import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1807 extends JFrame {

  public static void main(String[] args) {
    new Pgm_1807();
  }

  public Pgm_1807() {
    super("以自選顏色畫矩形");
    Container contentPane = getContentPane();
    MyPanel p = new MyPanel();
    contentPane.add(p,"Center");
    p.addMouseListener(p);

    JButton chooseColor = new JButton("選擇顏色");
    chooseColor.addActionListener(p);
    contentPane.add(chooseColor,"North");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(320,240);
    setVisible(true);
  }
}

class MyPanel extends JPanel implements ActionListener,
                                        MouseListener {

  Color c = Color.WHITE;
  float x=0,y=0,w=0,h=0;  // 記錄滑鼠動作的相關座標

  public void actionPerformed(ActionEvent e) {
    // 顯示選擇顏色交談窗
    c=(new JColorChooser()).showDialog(this,"選擇顏色",Color.WHITE);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setPaint(c);
    g2.draw(new Rectangle2D.Float(x,y,w,h));
  }

  public void mousePressed(MouseEvent e) {
    // 若按下滑鼠左鍵, 即記錄滑鼠座標
    if(e.getButton() == MouseEvent.BUTTON1) {
      x=e.getX();
      y=e.getY();
    }
  }

  public void mouseReleased(MouseEvent e) {
    // 若放開滑鼠左鍵, 即用滑鼠座標算出長與寬
    if(e.getButton() == MouseEvent.BUTTON1) {
      w=Math.abs(e.getX()-x);
      h=Math.abs(e.getY()-y);
      if(e.getX()<x)
        x=e.getX();
      if(e.getY()<y)
        y=e.getY();
      repaint();
    }
  }

  // MouseListener 介面中未用到的方法
  public void mouseClicked(MouseEvent event) {}
  public void mouseEntered(MouseEvent event) {}
  public void mouseExited(MouseEvent event) {}
}
