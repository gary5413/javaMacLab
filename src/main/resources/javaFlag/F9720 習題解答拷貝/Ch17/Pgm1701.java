import java.io.*;

public class Pgm1701 {

  public static void main(String args[]) throws IOException {

    System.out.println("餘弦定理應用：計算三角形邊長");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入已知的第一邊邊長：");
    String str = br.readLine();
    double b = Double.parseDouble(str);

    System.out.print("請輸入已知的第二邊邊長：");
    str = br.readLine();
    double c = Double.parseDouble(str);

    System.out.print("請輸入上列兩邊的夾角：");
    str = br.readLine();
    double theta = Double.parseDouble(str);
    theta *= (Math.PI / 180);   // 轉換為弳度

    System.out.print("三角形第三邊的邊長為：" +
                     Math.sqrt(b*b + c*c - 2*b*c*Math.cos(theta)));
  }
}
