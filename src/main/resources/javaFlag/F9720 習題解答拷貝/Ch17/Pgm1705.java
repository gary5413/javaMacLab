import java.io.*;

public class Pgm1705 {

  public static void main(String args[]) throws IOException {

    int[] counter= {0,0,0,0,0,0,0};  // �O���U�Ʀr�X�{����, �� 0 �Ӥ������ϥ�

    for (int i=1;i<=100;i++) {
      int x = (int)(Math.random()*6) + 1;
      System.out.print("�Y�X"+x+"\t");
      counter[x]++;
      if (i%5==0) System.out.println();
    }

    for(int i=1;i<=6;i++)
      System.out.println(i+"�X�{"+counter[i]+"��");
  }
}

