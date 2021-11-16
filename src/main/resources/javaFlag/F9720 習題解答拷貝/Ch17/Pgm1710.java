import java.io.*;
import java.util.*;

class Student {

  private String name;
  private int  height;
  private int  weight;

  public Student(String n, int h, int w) {
    name = n;
    height = h;
    weight = w;
  }

  public String toString() {
    return  name + ", 身高" + height + "公分, 體重" + weight + "公斤";
  }
}

public class Pgm1710 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, Student> stuList = new TreeMap<>();  // 呼叫建構方法
    String[] number = {"1230", "1231", "1232", "1233", "1234", };
    Student[] stu = {new Student("張搧風", 170, 65),
                     new Student("韋衣簫", 172, 60),
                     new Student("胡輕扭", 165, 58),
                     new Student("陳油亮", 175, 70),
                     new Student("朱圓章", 168, 67)};

    for (int i=0;i<number.length;i++)
      stuList.put(number[i],stu[i]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while(true) {       // 用迴圈讓使用者可重複查詢
      System.out.println("查詢學生資料");
      System.out.print("請輸入學號的學生(按 Enter 結束程式)->");
      String str = br.readLine();
      if (str.equals(""))   // 若沒有內容就跳出迴圈
        break;

      if(stuList.containsKey(str))   // 若有對應的學號
        System.out.println("學號"+ str + "的學生是" + stuList.get(str) + "\n");
      else                           // 若無對應的學號
        System.out.println("沒有這個學號！\n");
    }
  }
}

