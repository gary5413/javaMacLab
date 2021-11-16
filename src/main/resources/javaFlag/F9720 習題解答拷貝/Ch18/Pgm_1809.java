import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1809 extends JPanel {
  Image img = null; // �N��v��������

  public Pgm_1809(String filename) {
    img = getToolkit().getImage(filename);  // ���J���w���v����
  }

  // ø�s�v���ɪ� Call-back ��k
  public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
    if (infoflags == java.awt.image.ImageObserver.ALLBITS) {    // ���o�v���j�p��
      setPreferredSize(new Dimension(width,height));    // �Y�]�w JPanel ���j�p
      revalidate();                             // �n�D�W�h�e�� (JScrollPane) ���s�վ�
    }
    return true;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.drawImage(img, new AffineTransform(), this);            // ��ܼv��
  }

  public static void main(String[] args) {
    try {
      Pgm_1809 dimg = new Pgm_1809(args[0]);

      JFrame f = new JFrame(args[0]);
      f.getContentPane().add(new JScrollPane(dimg));    // �N���O�[�� JScrollPane ��
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(640,480);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("�Ϊk: java ShowImage <�v���ɦW��>");
      System.exit(0);
    }
  }
}

