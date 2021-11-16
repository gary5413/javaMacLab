import java.io.*;
import java.util.*;

public class Pgm1703 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, String> months = new TreeMap<>();  // 呼叫建構方法
    String[] monthName = {"January", "February", "March",
                          "April", "May", "June",
                          "July", "August", "September",
                          "October", "November", "December"};
    for (int i=1;i<=12;i++)
      months.put(Integer.toString(i),monthName[i-1]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // 用迴圈讓使用者可重複查詢
      System.out.println("要查哪個月的英文單字");
      System.out.print("(直接按 Enter 可結束程式)->");
      str = br.readLine();
      if (str.equals(""))   // 若沒有內容就跳出迴圈
        break;
      System.out.println(str + "月的英文是" + months.get(str) + "\n");
    }
  }
}
