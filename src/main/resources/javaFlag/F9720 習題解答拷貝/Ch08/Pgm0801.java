class IcCard {  // �N�� IC �d�����O
  long id;      // �d��
  int money;    // �d���l�B

  void showInfo() {  // ��ܥd����T����k
    System.out.print("�d���d�� "+ id);
    System.out.println(", �l�B " + money + " �� ");
  }

  Boolean add(int value) {  // �[�Ȥ�k�G�ѼƬ��n�[�Ȫ����B
    if (value>0 && value+money <= 10000) { // �x�ȤW���@�U
      money += value;
      return true;   // �[�Ȧ��\
    }
    return false;    // �[�ȥ���
  }
  
  Boolean substract(int value) {  // ���ڤ�k�G�ѼƬ��n���ڪ����B
    if (value>0 && money-value >= 0) { // �l�B���~�঩��
      money -= value;
      return true;   // ���ڦ��\
    }
    return false;    // ���ڥ���
  }
}

public class Pgm0801 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // �إߪ���
    myCard.id = 0x336789AB;  // �]�w�����ܼƭ�
    myCard.money = 0;

    System.out.println("�[�� 300 ��" +
               (myCard.add(300) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k

    System.out.println("���� 109 ��" +
               (myCard.substract(109) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k
    
    System.out.println("���� 209 ��" +
               (myCard.substract(209) ? "���\":"����") );
    myCard.showInfo();       // �I�s��k
  }
}

