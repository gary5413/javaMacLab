import java.io.*;

public class Pgm0603 {

  public static void main(String args[]) throws IOException {

    System.out.println("�п�J��Ӿ��");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�Ĥ@�Ӿ�ơG");
    String str = br.readLine();
    int n = Integer.parseInt(str);

    System.out.print("�ĤG�Ӿ�ơG");
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
    System.out.println(n + "��" + m + "������ƩM��" + sum);
  }
}
