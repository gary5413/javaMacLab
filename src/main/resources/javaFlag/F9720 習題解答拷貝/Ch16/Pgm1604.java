import java.io.*;

public class Pgm1604 {

  public static void main(String args[]) throws IOException {

    System.out.println("�nŪ�����ɮצW�� (���|)");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // ���o�ɦW�r��
    FileReader fr = new FileReader(str);  // �إ� FileReader ����

    System.out.println("���ɮצ@�t���G");
    int ch;
    int[] count=new int[256];
    while ((ch=fr.read()) != -1)    // �bŪ�� -1 ���e, ����Ū��
      count[ch]++;

    long charsum=0;
    for (int i=65;i<91;i++) {
      System.out.print((char) i + "��" +count[i] + "�ӡA");
      charsum +=count[i];
      System.out.print((char) (i+32) + "��" +count[i+32] + "�ӡA");
      charsum +=count[i+32];
      if (i%2 == 0)
        System.out.println();
    }
    System.out.println("�Ҧ��^��r���@" + charsum + "��");
    fr.close();
  }
}
