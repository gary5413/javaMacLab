public class Pgm0605 {

  public static void main(String args[]) {

    int sum = 0, i; // �ŧi�֥[�� sum �P�j���ܼ� i

    System.out.println("1��100���ݩ�5��7�����ƪ���Ʀ��G");
    for (i=1;i<=100;i++)  // �] 100 ���� for �j��
      if (i%5==0 | i%7==0)
        System.out.print(i + "\t");
  }
}
