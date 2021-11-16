import java.io.*;
import java.util.*;

public class Pgm1709 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, String> stuList = new TreeMap<>();  // 呼叫建構方法
    String[] students = {"1230", "張搧風",
                         "1231", "韋衣簫",
                         "1232", "胡輕扭",
                         "1233", "陳油亮",
                         "1234", "朱圓章"};
    for (int i=0;i<10;i+=2)
      stuList.put(students[i],students[i+1]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // 用迴圈讓使用者可重複查詢
      System.out.println("要查哪個學號的學生");
      System.out.print("(直接按 Enter 可結束程式)->");
      str = br.readLine();
      if (str.equals(""))   // 若沒有內容就跳出迴圈
        break;
      if(stuList.containsKey(str))
        System.out.println("學號"+ str + "的學生是" + stuList.get(str) + "\n");
      else
        System.out.println("沒有這個學號！\n");
    }
  }
}
