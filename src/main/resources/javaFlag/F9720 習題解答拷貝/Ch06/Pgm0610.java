import java.io.*;

public class Pgm0610 {

  public static void main(String args[]) throws IOException {

    System.out.println("�ƦC�p��");
    System.out.println(" x+1    x+2           x+n");
    System.out.println("�w�w + �w�w  + ... + �w�w");
    System.out.println(" n      n-1           1");


    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�A�ȡG");
    String str = br.readLine();
    int x=Integer.parseInt(str);

    System.out.print("�п�J���ȡG");
    str = br.readLine();
    int n=Integer.parseInt(str);

    double sum=0;

    for (int i=1;i<=n;i++)      // �i��p�⪺�j��
      sum += (x+i)/(double)(n-i+1);

    System.out.println("�`�M���G" + sum);
  }
}
