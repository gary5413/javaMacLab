import java.io.*;

public class Pgm1607 {

  public static void main(String args[]) throws IOException {

    System.out.println("�M����w�r��");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�ɮצW�١G");
    String str = br.readLine();           // ���o�ɦW�r��
    FileReader fr = new FileReader(str);
    char[] ch = new char[1048576];

    if (fr.read(ch) > 0) {
      System.out.print("�п�J�n�䪺�r��G");
      str = br.readLine();
      search(ch,str);
    } else
      System.out.println("�ɮרS�����e");
  }

  public static void search(char[] ch, String target)  {

    String str = new String(ch);
    int index=0, count=0;

    while ((index=str.indexOf(target,index)) != -1) {
      count++;
      index += target.length();
    }

    System.out.println("���w�r��" + target + "�@�X�{" + count +"��");
  }
}
