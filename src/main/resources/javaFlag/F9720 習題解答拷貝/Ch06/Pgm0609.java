import java.io.*;

public class Pgm0609 {

  public static void main(String args[]) throws IOException {

    int[] draw={15,20,21,33,35,46};     // �Ѥp�ƨ�j���������X
    int[] num=new int[6];

    System.out.println("�������");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�z�����鸹�X(�@6�X)");

    int i;      // �j���ܼ�, �����e�ŧi, �]���j����ٷ|�Ψ�
    for (i=0;i<6;i++) {
      System.out.print("�п�J��" + (i+1) + "�X�G");
      String str = br.readLine();
      num[i]=Integer.parseInt(str);
    }

    sort(num);  // ���}�C num �����Ʀr�Ѥj��p�Ƨ�

    for (i=0;i<6;i++) { // �i���諸�j��
      if (draw[i]==num[i])
        continue;
      else
        break;
    }

    if (i==6)
      System.out.println("\n���ߤ����I");
    else
      System.out.println("\n�U���A�ӡI");
  }

  public static void sort(int[] num) {
    for (int i=0;i<num.length;i++)
      for (int j=i+1;j<num.length;j++)
        if (num[i]>num[j]) {
          int temp=num[i];
          num[i]=num[j];
          num[j]=temp;
        }
  }
}
