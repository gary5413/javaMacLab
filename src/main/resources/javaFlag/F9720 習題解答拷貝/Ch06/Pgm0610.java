import java.io.*;

public class Pgm0610 {

  public static void main(String args[]) throws IOException {

    System.out.println("數列計算");
    System.out.println(" x+1    x+2           x+n");
    System.out.println("── + ──  + ... + ──");
    System.out.println(" n      n-1           1");


    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入ｘ值：");
    String str = br.readLine();
    int x=Integer.parseInt(str);

    System.out.print("請輸入ｎ值：");
    str = br.readLine();
    int n=Integer.parseInt(str);

    double sum=0;

    for (int i=1;i<=n;i++)      // 進行計算的迴圈
      sum += (x+i)/(double)(n-i+1);

    System.out.println("總和為：" + sum);
  }
}
