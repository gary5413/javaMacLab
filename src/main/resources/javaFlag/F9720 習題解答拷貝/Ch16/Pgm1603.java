import java.io.*;

public class Pgm1603 {

  public static void main(String args[]) throws IOException {

    System.out.println("��ܤ���r����Big-5�X");
    System.out.print("�п�J�@�Ӥ���r���G");
    int upper =  System.in.read();   // ����r������Ӧ줸�աA
    int lower =  System.in.read();   // �ҥH�n�sŪ�⦸

    System.out.println("Big-5�X�O�G"
                + Integer.toHexString(upper)    // �ഫ�� 16 �i����
                + Integer.toHexString(lower));
  }
}
