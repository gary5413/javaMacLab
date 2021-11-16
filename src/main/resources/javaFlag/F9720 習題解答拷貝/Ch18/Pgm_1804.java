import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pgm_1804 extends KeyAdapter
                      implements ActionListener {
  JFrame f = new JFrame("�p��T�����");
  JTextField degree = new JTextField();

  JTextField sintxt = new JTextField();
  JTextField costxt = new JTextField();
  JTextField tantxt = new JTextField();
  JLabel sinlab =new JLabel(" SIN() ");
  JLabel coslab =new JLabel(" COS() ");
  JLabel tanlab =new JLabel(" TAN() ");

  JButton go = new JButton("�p��");
  double convert = 180 / Math.PI;  // �@�y�׵��� (180/�k) ��

  public static void main(String[] args) {
    Pgm_1804 tri = new Pgm_1804();
    tri.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    // �N��Ӥ���� JPanel �[�J JFrame
    contentPane.add(p1,"North");
    contentPane.add(p2,"Center");
    contentPane.add(go,"South");

    // �N JPanel �]�w���ϥ� GridLayout (2 �C�B1 ��)
    p1.setLayout(new GridLayout(2,1));
    p1.add(buildMenu());
    p1.add(degree);

    // �N JPanel �]�w���ϥ� GridLayout (3 �C�B2 ��)
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

  // �b��J�ϫ� ENTER ��]�|�i��p��
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_ENTER) calc();
  }

  public void calc() {
    try {
      // ���o��J�Ϫ��r��, �ন�B�I�ƫᰣ�H���״�����
      double theta = Double.parseDouble(degree.getText())/convert;
      // �p��T����ƭ�, �ñN���G�g��U��r��줤
      sintxt.setText(Double.toString(Math.sin(theta)));
      costxt.setText(Double.toString(Math.cos(theta)));
      tantxt.setText(Double.toString(Math.tan(theta)));
    } catch (NumberFormatException e) {
      degree.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
    }
  }

  // �إߥ\����e����k
  public JMenuBar buildMenu() {
    JMenuBar mbar = new JMenuBar();
    JMenu menu = new JMenu("�]�w���");
    mbar.add(menu);

    ButtonGroup group = new ButtonGroup();

    // ����
    JMenuItem item = new JCheckBoxMenuItem("����", true);
    item.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 180 / Math.PI;
      }
    });
    menu.add(item);
    group.add(item); // �N��ӥ\����س]���@��

    // �y��
    item = new JCheckBoxMenuItem("�y��", false);
    item.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 1;
      }
    });
    menu.add(item);
    group.add(item); // �N��ӥ\����س]���@��

    return mbar;
  }
}
