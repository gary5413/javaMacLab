import java.io.*;

public class Pgm1605 {

  public static void main(String args[]) throws IOException {

    System.out.println("�nŪ�����ɮצW�� (���|)");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // ���o�ɦW�r��
    FileReader fr = new FileReader(str);  // �إ� FileReader ����
    FileWriter fw = new FileWriter("new");

    int ch;
    while ((ch=fr.read()) != -1) {  // �bŪ�� -1 ���e, ����Ū��
      if (ch>= 97 & ch<=122)
        ch -=32;        // �N�p�g�r�����r�X�� 32 �N�ܦ��j�g
      fw.write(ch);
    }
    fr.close();
    fw.close();
  }
}

