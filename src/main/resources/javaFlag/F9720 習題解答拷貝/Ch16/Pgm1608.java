import java.io.*;

public class Pgm1608 {

  public static void main(String args[]) throws IOException {

    System.out.println("���N���w�r��");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�ɮצW�١G");
    String str = br.readLine();           // ���o�ɦW�r��
    FileReader fr = new FileReader(str);
    char[] ch = new char[1048576];

    if (fr.read(ch) > 0) {
      System.out.print("�п�J�n�Q���N���r��G");
      String oldstr = br.readLine();
      System.out.print("�n�N"+oldstr+"��������r��G");
      String newstr = br.readLine();

      // �NŪ�쪺�r���}�C�h���h�l�ťի�إߦr��
      String filestr = (new String(ch)).trim();

      // �N���N�᪺�r�ꤺ�e�g�^�ɮ�
      FileWriter fw = new FileWriter(str);
      fw.write(filestr.replace(oldstr,newstr));
      fw.flush();
    } else
      System.out.println("�ɮרS�����e");
  }
}
