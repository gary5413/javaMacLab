interface P1 { // ������
  int i = 20;

  void show();
}

interface P2 { // ������
  int i = 30;

  void show();
}

interface C extends P1,P2 { // �l����
  void show(String s); // �h���w�q������
}

public class SameMemberName implements C { // ��@����
  public void show() { // ��@��P1�PP2C�~�ӨӪ���k
    show("");
  }

  public void show(String s) { // ��@C���h���w�q����k
    System.out.println(s + "P1.i=" + P1.i + ", P2.i=" + P2.i);
  }

  public static void main(String[] argv) {
    SameMemberName s = new SameMemberName();
    s.show();
  }
}