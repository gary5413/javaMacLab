import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1810 extends JPanel implements KeyListener{
  Image img = null; // �N��v��������
  double prop = 1;  // �Y���

  public Pgm_1810(String filename) {
    img = getToolkit().getImage(filename);  // ���J���w���v����
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyChar() == '+')      // �� "+"
      prop = (prop==1) ? 2:prop*2;  // ��j�@��
    else if (e.getKeyChar() == '-') // �� "-"
      prop/=2;                      // �Y�p�@�b
    else
      return;
    // ���s�վ㭱�O�j�p
    setPreferredSize(new Dimension((int)(img.getWidth(null)*prop),
                                   (int)(img.getHeight(null)*prop)));
    revalidate();               // �n�D�W�h�e�� (JScrollPane) ���s�վ�
    repaint();                  // ���e
  }

  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
    if (infoflags == java.awt.image.ImageObserver.ALLBITS) {
      setPreferredSize(new Dimension((int)(width*prop), (int)(height*prop)));
      revalidate();             // �n�D�W�h�e�� (JScrollPane) ���s�վ�
    }
    return true;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    AffineTransform at = new AffineTransform();
    at.scale(prop,prop);                    // �]�w�Y����
    g2.drawImage(img, at, this);            // ��ܼv��
  }

  public static void main(String[] args) {
    try {
      Pgm_1810 dimg = new Pgm_1810(args[0]);
      JFrame f = new JFrame(args[0]);

      f.addKeyListener(dimg);               // �[�J��L�ƥ��ť��
      f.getContentPane().add(new JScrollPane(dimg));
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(320,240);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("�Ϊk: java ShowImage <�v���ɦW��>");
      System.exit(0);
    }
  }
}


