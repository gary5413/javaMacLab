public class Pgm0601 {

  public static void main(String args[]) {

    int sum = 0, i; // �ŧi�֥[�� sum �P�j���ܼ� i

    for (i=1;i<=100;i++)  // �] 100 ���� for �j��
      if (i%3==0)         // �u�֥[��Q3�㰣����
        sum += i;
    System.out.println("1-100���Ҧ�3�����ƪ��`�M��" + sum);
  }
}
