import java.io.*;

public class Pgm0604 {

  public static void main(String args[]) throws IOException {

    System.out.println("�п�J��Ӿ��(�Y��J0�Y����)");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    long total = 0;
    while (true) {
      System.out.print("�Ĥ@�Ӿ�ơG");
      String str = br.readLine();
      int m = Integer.parseInt(str);

      System.out.print("�ĤG�Ӿ�ơG");
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

      System.out.println(m + "��" + n + "������ƩM��" + sum);
      total+=sum;
    }
    System.out.println("\n�Ҧ���ƩM��" + total);
  }
}
