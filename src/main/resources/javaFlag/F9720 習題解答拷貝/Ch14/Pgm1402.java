import java.io.*;

public class Pgm1402 {

  public static void main(String args[]) throws IOException {

    System.out.println("���H�s����");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�Q���ơG");
    String str = br.readLine();
    int x=Integer.parseInt(str);

    System.out.print("�п�J���ơG");
    str = br.readLine();
    int y=Integer.parseInt(str);

    if (y==0)           // �Y���Ƭ��s�Y�ߥX�ҥ~
      throw new ArithmeticException("���Ƭ��s");

    System.out.print(x+ "���H" + y + "���Ӭ�");
    System.out.println(x/y + "�l�Ƭ�" +x%y);
  }
}

