import java.io.*;

public class Pgm0603 {

  public static void main(String args[]) throws IOException {

    System.out.println("請輸入兩個整數");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("第一個整數：");
    String str = br.readLine();
    int n = Integer.parseInt(str);

    System.out.print("第二個整數：");
    str = br.readLine();
    int m = Integer.parseInt(str);
    
    if (m<n) {
      int temp = n;
      n = m;
      m = temp;
    }

    long sum = 0;
    for (int i=n;i<=m;i++)
      sum += i;
    System.out.println(n + "到" + m + "間的整數和為" + sum);
  }
}
