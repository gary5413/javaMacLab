import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1805 extends JPanel implements ActionListener {

  JTextField txt = new JTextField("0");
  double number =0;     // �ΨӰO���Ĥ@�ӼƦr
  boolean input = false;
  String op;

  public static void main(String[] args) {
    Pgm_1805 p = new Pgm_1805();
    JFrame f = new JFrame();
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,320);
    f.setVisible(true);
  }

  public Pgm_1805() {
    setLayout(new BorderLayout());
    add(txt, BorderLayout.NORTH);

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(4,4));      // �]�w 4x4 ���Ŷ��ө�m
                                           // �Ʀr�ιB��Ÿ������s
    String buttons = "789+456-123*.0=/";   // �ΨӫإߨC�ӫ��s���r��
    for (int i=0;i<buttons.length();i++) {
      JButton b = new JButton(buttons.substring(i,i+1));  // �C�����@�Ӧr�ӫإ߫��s
      p.add(b);
      b.addActionListener(this);
    }
    add(p,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    String buttons = "0123456789.+*-/"; // �Ψ�²�ƧP�_�����r��

    if (buttons.indexOf(s) == -1) {     // �ϥΪ̫��U����
      switch(buttons.indexOf(op)) {
          case 11:
            number += Double.parseDouble(txt.getText());
            break;
          case 12:
            number *= Double.parseDouble(txt.getText());
            break;
          case 13:
            number -= Double.parseDouble(txt.getText());
            break;
          case 14:
            number /= Double.parseDouble(txt.getText());
            break;
      }
      txt.setText(Double.toString(number));
      input = false;
    }
    else if (buttons.indexOf(s)<11) {   // �ϥΪ̫��U�Ʀr���s
      if (input)
        txt.setText(txt.getText()+s);   // �Y�w�}�l��J, �N�N�s�Ʀr�[��̫᭱
      else {
        input=true;
        txt.setText(s);
      }
    }
    else                // �䥦���p (�ϥΪ̫��U +*-/)
    {
      op = s;           // �N�B��Ÿ��O���_��
      number = Double.parseDouble(txt.getText());
      input = false;
    }
  }
}
