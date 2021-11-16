import java.io.*;

public class Pgm1402 {

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

    if (y==0)           // 若除數為零即拋出例外
      throw new ArithmeticException("除數為零");

    System.out.print(x+ "除以" + y + "的商為");
    System.out.println(x/y + "餘數為" +x%y);
  }
}

