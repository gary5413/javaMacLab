import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1801 {

  JFrame myframe = new JFrame("���q�ഫ");
  JTextField result = new JTextField();  // �ഫ���G��ܰ�
  JTextField weight = new JTextField();  // ��J��
  JButton k2p = new JButton("������^�S");
  JButton p2k = new JButton("�^�S�ऽ��");

  public static void main(String[] args) {
    Pgm_1801 test = new Pgm_1801();
  }

  public Pgm_1801() {
    // �����o ContentPane ����
    Container contentPane = myframe.getContentPane();

    // �N 5 �Ӥ���[�� BorderLayout �����Ӧ�m
    contentPane.add(new JLabel("�п�J���q, �A������Υk�䪺���s"),BorderLayout.NORTH);
    contentPane.add(k2p,BorderLayout.EAST);
    contentPane.add(p2k,BorderLayout.WEST);
    contentPane.add(weight,BorderLayout.CENTER);
    contentPane.add(result,BorderLayout.SOUTH);

    // ������^�S���s�� ActionListener()
    k2p.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            double k = Double.parseDouble(weight.getText());
            result.setText(k + " ���絥�� " + k*2.203 + " �^�S");
          } catch (NumberFormatException ne) {
            weight.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
          }
        }
      }
    );

    // �^�S�ऽ����s�� ActionListener()
    p2k.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            double p = Double.parseDouble(weight.getText());
            result.setText(p + " �^�S���� " + p*0.454 + " ����");
          } catch (NumberFormatException ne) {
            weight.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
          }
        }
      }
    );

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(400,120);
    myframe.setVisible(true);
  }
}

