import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1810 extends JPanel implements KeyListener{
  Image img = null; // 代表影像的物件
  double prop = 1;  // 縮放比

  public Pgm_1810(String filename) {
    img = getToolkit().getImage(filename);  // 載入指定的影像檔
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyChar() == '+')      // 按 "+"
      prop = (prop==1) ? 2:prop*2;  // 放大一倍
    else if (e.getKeyChar() == '-') // 按 "-"
      prop/=2;                      // 縮小一半
    else
      return;
    // 重新調整面板大小
    setPreferredSize(new Dimension((int)(img.getWidth(null)*prop),
                                   (int)(img.getHeight(null)*prop)));
    revalidate();               // 要求上層容器 (JScrollPane) 重新調整
    repaint();                  // 重畫
  }

  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
    if (infoflags == java.awt.image.ImageObserver.ALLBITS) {
      setPreferredSize(new Dimension((int)(width*prop), (int)(height*prop)));
      revalidate();             // 要求上層容器 (JScrollPane) 重新調整
    }
    return true;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    AffineTransform at = new AffineTransform();
    at.scale(prop,prop);                    // 設定縮放比例
    g2.drawImage(img, at, this);            // 顯示影像
  }

  public static void main(String[] args) {
    try {
      Pgm_1810 dimg = new Pgm_1810(args[0]);
      JFrame f = new JFrame(args[0]);

      f.addKeyListener(dimg);               // 加入鍵盤事件傾聽者
      f.getContentPane().add(new JScrollPane(dimg));
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(320,240);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("用法: java ShowImage <影像檔名稱>");
      System.exit(0);
    }
  }
}


