import java.io.*;

public class Pgm1609_Read {

  public static void main(String args[]) throws IOException, ClassNotFoundException {

    System.out.println("Ū���q�T���ɤ��e");
    System.out.print("Ū��J�q�T���ɦW�G");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // ���o�ɦW�r��

    ObjectInputStream ois =                 // �إߪ����J��y
      new ObjectInputStream(new FileInputStream(filename));

    try {
      while (true) {
        Pgm1609_Contact p = (Pgm_1609_Contact) ois.readObject();  // Ū�J����
        System.out.println(p);
      }
    } catch (EOFException e) {
      ois.close();
    }
  }
}


