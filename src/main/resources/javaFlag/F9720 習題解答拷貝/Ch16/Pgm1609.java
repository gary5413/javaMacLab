import java.io.*;

public class Pgm_1609 {

  public static void main(String args[]) throws IOException {

    System.out.print("�n�إߪ��q�T���ɦW�G");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();
    ObjectOutputStream oos =           // �إߪ����J��y����
      new ObjectOutputStream(new FileOutputStream(filename));

    do {
      System.out.print("�п�J�m�W�G");
      String str1 = br.readLine();
      System.out.print("�п�J�q�ܡG");
      String str2 = br.readLine();
      System.out.print("�п�J�q�l�H�c�G");
      String str3 = br.readLine();
      Pgm1609_Contact person = new Pgm1609_Contact(str1,str2,str3);

      oos.writeObject(person);

      System.out.print("�٭n��J�t�@����ƶ� (y/n)�G");
    } while (br.readLine().equalsIgnoreCase("Y")); // �^�� Y/y �Y�A����@���j��

    oos.flush();
    oos.close();

    System.out.println("\n�w�N��Ƽg�J�ɮ� " + filename);
  }
}
