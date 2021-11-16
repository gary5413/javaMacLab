import javax.swing.*;

public class LambdaListener extends JFrame {

  int act = 0;     // �ΨӰO�����s�Q���ƪ��ܼ�

  public static void main(String[] args) {
    LambdaListener test = new LambdaListener();
  }

  // �Ϋغc��k�إߤ���B�N����[�J�����B��ܵ���
  public LambdaListener() {
    setTitle("Listener �ܽd");
    JButton mybutton = new JButton("���Ӽ��D");

    // addActionListener() ���ѼƬ��ΦW���O����
    mybutton.addActionListener(
      e -> { act++;  
             setTitle("�o�� " + act + " �����s�ƥ�");
    });

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }
}
