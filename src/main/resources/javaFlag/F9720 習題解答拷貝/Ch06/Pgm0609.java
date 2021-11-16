import java.io.*;

public class Pgm0609 {

  public static void main(String args[]) throws IOException {

    int[] draw={15,20,21,33,35,46};     // 由小排到大的中獎號碼
    int[] num=new int[6];

    System.out.println("對獎測試");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.println("請輸入您的獎券號碼(共6碼)");

    int i;      // 迴圈變數, 但提前宣告, 因為迴圈後還會用到
    for (i=0;i<6;i++) {
      System.out.print("請輸入第" + (i+1) + "碼：");
      String str = br.readLine();
      num[i]=Integer.parseInt(str);
    }

    sort(num);  // 讓陣列 num 中的數字由大到小排序

    for (i=0;i<6;i++) { // 進行比對的迴圈
      if (draw[i]==num[i])
        continue;
      else
        break;
    }

    if (i==6)
      System.out.println("\n恭喜中獎！");
    else
      System.out.println("\n下次再來！");
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
