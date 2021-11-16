import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pgm_1808 extends JFrame {

  JTextField penWidth;  // �ѨϥΪ̿�J�e���ʲӪ����

  public static void main(String[] args) {
    new Pgm_1808();
  }

  public Pgm_1808() {
    super("�H�ۿ��C��ε��e�e�x��");
    Container contentPane = getContentPane();

    // �]�b�������O�|�Ψ즹����, �ҥH�ŧi�� final
    final MyPanel p = new MyPanel();
    contentPane.add(p,"Center");
    p.addMouseListener(p);

    JButton chooseColor = new JButton("����C��");
    chooseColor.addActionListener(p);
    contentPane.add(chooseColor,"North");

    // �b JFrame �U�b����m�����]�w�e���e�ת����
    JPanel south = new JPanel();
    south.setLayout(new GridLayout(1,2));
    south.add(new JLabel("�e���e�סG"));
    penWidth = new JTextField();
    south.add(penWidth);

    // ��ϥΪ̦b��r�椤���U Enter ��, �N�|�޵o�ƥ�
    penWidth.addActionListener(new ActionListener() {
      public void actionPerformed (ActionEvent e) {
        try {
          p.setPenWidth(Float.parseFloat(penWidth.getText()));
        }
        catch (NumberFormatException ne) {
          penWidth.setText("");
        }
      }
    });
    contentPane.add(south,"South");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(320,240);
    setVisible(true);
  }
}

class MyPanel extends JPanel implements ActionListener,
                                        MouseListener {

  Color c = Color.WHITE;
  float x=0,y=0,w=0,h=0;  // �O���ƹ��ʧ@�������y��
  float width=1;          // �e���ʲ�

  // �ѥ~���I�s�]�w�e���ʲӪ���k
  public void setPenWidth(float w) { width = w; }

  public void actionPerformed(ActionEvent e) {
    // ��ܿ���C���͵�
    c=(new JColorChooser()).showDialog(this,"����C��",Color.WHITE);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setPaint(c);
    g2.setStroke(new BasicStroke(width));
    g2.draw(new Rectangle2D.Float(x,y,w,h));
  }

  public void mousePressed(MouseEvent e) {
    // �Y���U�ƹ�����, �Y�O���ƹ��y��
    if(e.getButton() == MouseEvent.BUTTON1) {
      x=e.getX();
      y=e.getY();
    }
  }

  public void mouseReleased(MouseEvent e) {
    // �Y��}�ƹ�����, �Y�ηƹ��y�к�X���P�e
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

  // MouseListener ���������Ψ쪺��k
  public void mouseClicked(MouseEvent event) {}
  public void mouseEntered(MouseEvent event) {}
  public void mouseExited(MouseEvent event) {}
}

