import java.io.*;

public class Pgm1608 {

  public static void main(String args[]) throws IOException {

    System.out.println("取代指定字串");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入檔案名稱：");
    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);
    char[] ch = new char[1048576];

    if (fr.read(ch) > 0) {
      System.out.print("請輸入要被取代的字串：");
      String oldstr = br.readLine();
      System.out.print("要將"+oldstr+"換成什麼字串：");
      String newstr = br.readLine();

      // 將讀到的字元陣列去除多餘空白後建立字串
      String filestr = (new String(ch)).trim();

      // 將取代後的字串內容寫回檔案
      FileWriter fw = new FileWriter(str);
      fw.write(filestr.replace(oldstr,newstr));
      fw.flush();
    } else
      System.out.println("檔案沒有內容");
  }
}
