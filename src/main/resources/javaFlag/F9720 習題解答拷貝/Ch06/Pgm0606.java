import java.io.*;

public class Pgm0606 {

  public static void main(String args[]) throws IOException {

    System.out.println("用星號畫矩形");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入矩形寬：");
    String str = br.readLine();
    int width = Integer.parseInt(str);

    System.out.print("請輸入矩形高：");
    str = br.readLine();
    int height = Integer.parseInt(str);

    for (int i=1;i<=height;i++) {
      for (int j=1;j<=width;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}

