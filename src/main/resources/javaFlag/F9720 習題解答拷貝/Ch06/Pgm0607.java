import java.io.*;

public class Pgm0607 {

  public static void main(String args[]) throws IOException {

    System.out.print("�n�e�h�����P���٧Ρ]�Y��J���ơA");
    System.out.print("�N�۰ʤ֤@��)�G");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int line = (Integer.parseInt(str)+1)/2;

    for (int i=1;i<=line;i++) {   // �~�j��, �����
      for (int j=1;j<=line-i;j++) // ���j�� 1, �����X�ť�
        System.out.print(" ");
      for (int k=1;k<2*i;k++)     // ���j�� 2, �����X�P��
        System.out.print("*");
      System.out.println();       // �C��X�@��N����
    }
    for (int i=line-1;i>=1;i--) {   // �~�j��, �����
      for (int j=1;j<=line-i;j++) // ���j�� 1, �����X�ť�
        System.out.print(" ");
      for (int k=1;k<2*i;k++)     // ���j�� 2, �����X�P��
        System.out.print("*");
      System.out.println();       // �C��X�@��N����
    }
  }
}


