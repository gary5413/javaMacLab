import java.io.*;

public class Pgm1701 {

  public static void main(String args[]) throws IOException {

    System.out.println("�l���w�z���ΡG�p��T�������");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�w�����Ĥ@������G");
    String str = br.readLine();
    double b = Double.parseDouble(str);

    System.out.print("�п�J�w�����ĤG������G");
    str = br.readLine();
    double c = Double.parseDouble(str);

    System.out.print("�п�J�W�C���䪺�����G");
    str = br.readLine();
    double theta = Double.parseDouble(str);
    theta *= (Math.PI / 180);   // �ഫ���y��

    System.out.print("�T���βĤT�䪺������G" +
                     Math.sqrt(b*b + c*c - 2*b*c*Math.cos(theta)));
  }
}
