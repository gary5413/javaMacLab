import java.io.*;

public class Pgm0606 {

  public static void main(String args[]) throws IOException {

    System.out.println("�άP���e�x��");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�x�μe�G");
    String str = br.readLine();
    int width = Integer.parseInt(str);

    System.out.print("�п�J�x�ΰ��G");
    str = br.readLine();
    int height = Integer.parseInt(str);

    for (int i=1;i<=height;i++) {
      for (int j=1;j<=width;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}

