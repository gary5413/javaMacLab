import java.io.*;

public class Pgm0608 {

  public static void main(String args[]) throws IOException {

    System.out.println("�K�X��J����");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�K�X�G");
    String pass = br.readLine();

    int chance = 3;
    while (chance-- > 0) {
      System.out.print("�ЦA��J�@���K�X�G");
      String pass2 = br.readLine();

      if (pass == pass2)
        break;
      else
        System.out.println("���~�I");
    }

    if (chance == -1)
        System.out.println("��J�T�����~�I�{������I");
    else
        System.out.println("��J���T");
  }
}
