import java.io.*;

public class Pgm0604 {

  public static void main(String args[]) throws IOException {

    System.out.println("請輸入兩個整數(若輸入0即結束)");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    long total = 0;
    while (true) {
      System.out.print("第一個整數：");
      String str = br.readLine();
      int m = Integer.parseInt(str);

      System.out.print("第二個整數：");
      str = br.readLine();
      int n = Integer.parseInt(str);

      if (m==0 | n==0)
        break;

      if (m>n) {
        int temp = n;
        n = m;
        m = temp;
      }

      long sum = 0;

      for (int i=m;i<=n;i++)
        sum += i;

      System.out.println(m + "到" + n + "間的整數和為" + sum);
      total+=sum;
    }
    System.out.println("\n所有整數和為" + total);
  }
}
