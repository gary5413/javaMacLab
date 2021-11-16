import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1802 {

  JFrame myframe = new JFrame("�q�Ʀr�j�p");
  JTextField stage = new JTextField();  // ��ܥثe�b�ĴX��
  JButton smaller = new JButton("��7�p");
  JButton bigger = new JButton("��7�j");
  int count = 0;      // �O������ĴX��
  int secret=7;       // �H���Ʀr

  public static void main(String[] args) {
    Pgm_1802 test = new Pgm_1802();
  }

  public Pgm_1802() {
    // �����o ContentPane ����
    Container contentPane = myframe.getContentPane();

    // �N 5 �Ӥ���[�� BorderLayout �����Ӧ�m
    contentPane.add(buildMenu(),BorderLayout.NORTH);
    contentPane.add(smaller,BorderLayout.EAST);
    contentPane.add(bigger,BorderLayout.WEST);
    contentPane.add(new JLabel("�@�@�@�H"),BorderLayout.CENTER);
    contentPane.add(stage,BorderLayout.SOUTH);
    newsecret();

    // �q�񢶤p
    smaller.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if ( Math.max(7,secret) == 7)
            newsecret();
          else
            failed();
        }
      }
    );

    // �q�񢶤j
    bigger.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (Math.min(7,secret) == 7)
            newsecret();
          else
            failed();
        }
      }
    );

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(240,120);
    myframe.setVisible(true);
  }

  // �إߥ\����e����k
  public JMenuBar buildMenu() {
    JMenuBar mbar = new JMenuBar();
    JMenu menu = new JMenu("�{�� (P)");
    menu.setMnemonic(KeyEvent.VK_P);
    mbar.add(menu);

    // �}�l�s�C��
    JMenuItem item = new JMenuItem("�s�C�� (N)", KeyEvent.VK_N);
    item.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        newgame();
      }
    });
    menu.add(item);

    // �����{��
    item = new JMenuItem("���� (X)", KeyEvent.VK_X);
    item.addActionListener( new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    menu.add(item);

    return mbar;
  }

  // ���ͷs�ü�
  public void newsecret() {
    if (count++==5) {
      stage.setText("�L�����I�AĹ�F�C");
      stop();
    }
    else {
      stage.setText("��"+count+"��");
      do {
        secret = (int) (Math.random() * 13 + 1);
      } while (secret == 7); // ���H���Ʀr���|����7
    }
  }

  public void failed() {
    stage.setText("�q���F�I�����Ʀr�O"+secret+"�C�z�����"+count+"��");
    stop();
  }

  // ����C��
  public void stop() {
    bigger.setEnabled(false);
    smaller.setEnabled(false);
  }

  // �}�l�s�C��
  public void newgame() {
    count=0;
    newsecret();
    bigger.setEnabled(true);
    smaller.setEnabled(true);
  }
}
