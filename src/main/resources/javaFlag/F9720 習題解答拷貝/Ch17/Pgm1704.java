import java.io.*;

public class Pgm1704 {

  public static void main(String args[]) throws IOException {

    try {
      FileReader fr = new FileReader(args[0]);  // 建立 FileReader 物件

      System.out.println("此檔案共含有：");
      int ch;
      int count=0; // 用來記錄數字字元的數量
      while ((ch=fr.read()) != -1)    // 在傳回 -1 之前, 持續讀取
        if(Character.isDigit(ch))
          count++;

      System.out.println("檔案" + args[0] + "中共有" + count + "個數字字元");
      fr.close();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("用法：請在程式名稱後指定要讀取的檔案路徑");
    }
  }
}
