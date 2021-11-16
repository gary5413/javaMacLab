import java.io.*;

public class Pgm1705 {

  public static void main(String args[]) throws IOException {

    int[] counter= {0,0,0,0,0,0,0};  // 記錄各數字出現次數, 第 0 個元素不使用

    for (int i=1;i<=100;i++) {
      int x = (int)(Math.random()*6) + 1;
      System.out.print("擲出"+x+"\t");
      counter[x]++;
      if (i%5==0) System.out.println();
    }

    for(int i=1;i<=6;i++)
      System.out.println(i+"出現"+counter[i]+"次");
  }
}

