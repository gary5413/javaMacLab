import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pgm_1806 extends JPanel implements ActionListener {
  JFrame f = new JFrame("��JColorChooser����C��");
  Color c = Color.WHITE;

  public static void main(String[] args) {
    Pgm_1806 test = new Pgm_1806();
    test.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    contentPane.add(this,"Center");

    JButton chooseColor = new JButton("����C��");
    chooseColor.addActionListener(this);
    contentPane.add(chooseColor,"North");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,240);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    // ��ܿ���C���͵�
    c=(new JColorChooser()).showDialog(f,"����C��",Color.WHITE);

    // �Y�ϥΪ̦�����C��
    if (c!=null)
      setBackground (c);
  }
}

