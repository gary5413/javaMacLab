import java.io.*;

public class Pgm1606 {

  public static void main(String args[]) throws IOException {

    System.out.println("�ƻs�ɮת��{��");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�ӷ��ɸ��|���ɦW�G");
    String str = br.readLine();           // ���o�ɦW�r��
    FileInputStream fr = new FileInputStream(str);

    System.out.print("�п�J�ت��ɸ��|���ɦW�G");
    str = br.readLine();           // ���o�ɦW�r��
    FileOutputStream fw = new FileOutputStream(str);

    int data;
    while ((data = fr.read()) != -1)
      fw.write(data);

    fr.close();
    fw.close();
  }
}
