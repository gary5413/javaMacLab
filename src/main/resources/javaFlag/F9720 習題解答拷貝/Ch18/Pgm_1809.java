import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1809 extends JPanel {
  Image img = null; // 代表影像的物件

  public Pgm_1809(String filename) {
    img = getToolkit().getImage(filename);  // 載入指定的影像檔
  }

  // 繪製影像時的 Call-back 方法
  public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
    if (infoflags == java.awt.image.ImageObserver.ALLBITS) {    // 取得影像大小後
      setPreferredSize(new Dimension(width,height));    // 即設定 JPanel 的大小
      revalidate();                             // 要求上層容器 (JScrollPane) 重新調整
    }
    return true;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.drawImage(img, new AffineTransform(), this);            // 顯示影像
  }

  public static void main(String[] args) {
    try {
      Pgm_1809 dimg = new Pgm_1809(args[0]);

      JFrame f = new JFrame(args[0]);
      f.getContentPane().add(new JScrollPane(dimg));    // 將面板加到 JScrollPane 中
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(640,480);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("用法: java ShowImage <影像檔名稱>");
      System.exit(0);
    }
  }
}

