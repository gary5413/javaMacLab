import java.io.*;

public class Pgm1704 {

  public static void main(String args[]) throws IOException {

    try {
      FileReader fr = new FileReader(args[0]);  // �إ� FileReader ����

      System.out.println("���ɮצ@�t���G");
      int ch;
      int count=0; // �ΨӰO���Ʀr�r�����ƶq
      while ((ch=fr.read()) != -1)    // �b�Ǧ^ -1 ���e, ����Ū��
        if(Character.isDigit(ch))
          count++;

      System.out.println("�ɮ�" + args[0] + "���@��" + count + "�ӼƦr�r��");
      fr.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("�Ϊk�G�Цb�{���W�٫���w�nŪ�����ɮ׸��|");
    }
  }
}
