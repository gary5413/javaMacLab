import java.io.*;

public class Pgm1610 {

  public static void main(String args[]) throws IOException {

    System.out.println("�Τ@�o������{��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] str =new String[4];

    System.out.print("�п�J�S�������G");
    str[0] = br.readLine();

    for (int i=1;i<str.length;i++) {
      System.out.print("�п�J��"+(i+1)+"���Y�������G");
      str[i] = br.readLine();
    }

    compare(str);       // �I�s��︹�X����k
  }

  public static void compare(String[] prize) throws IOException {

    BufferedReader br =           // �إ��ɮ׿�J��y����
      new BufferedReader(new FileReader("invoice.txt"));

    String number = new String();  //�ΨӰO���C�i�o�������X

    try {
      next:while ((number = br.readLine()) != null) {

        // ���S��
        if (number.equals(prize[0])) {
          System.out.println(number + "�o�i�o�����F�S���I");
          continue next;        // �o�i�����F, ���U�@�i�o���~����
        }

        // ���T���Y��
        for (int i=1;i<prize.length;i++) {

          // ���P�@�������������X...�쥽�T�X
          for (int j=0;j<=5;j++)
            if ( (number.substring(j)).equals (prize[i].substring(j)) ) {
              if (j==0)
                System.out.println(number + "�o�i�o�����F�Y���I");
              else
                System.out.println(number + "�o�i�o�����F" + (j+1) + "���I");
              continue next;    // �o�i�����F, ���U�@�i�o���~����
            }
        }
      }
    } catch (EOFException e) { }
  }
}