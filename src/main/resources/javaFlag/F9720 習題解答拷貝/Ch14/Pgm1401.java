import java.io.*;

public class Pgm1401 {

  public static void main(String args[]) throws IOException {

    System.out.println("除以零測試");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入被除數：");
    String str = br.readLine();
    int x=Integer.parseInt(str);

    System.out.print("請輸入除數：");
    str = br.readLine();
    int y=Integer.parseInt(str);

    try {
      System.out.print(x+ "除以" + y + "的商為");
      System.out.println(x/y + "餘數為" +x%y);
    } catch (ArithmeticException e) {
      System.out.println("\n發生例外！");
      System.out.println(e);
    }
  }
}
