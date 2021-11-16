import java.io.*;

public class Pgm1607 {

  public static void main(String args[]) throws IOException {

    System.out.println("尋找指定字串");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入檔案名稱：");
    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);
    char[] ch = new char[1048576];

    if (fr.read(ch) > 0) {
      System.out.print("請輸入要找的字串：");
      str = br.readLine();
      search(ch,str);
    } else
      System.out.println("檔案沒有內容");
  }

  public static void search(char[] ch, String target)  {

    String str = new String(ch);
    int index=0, count=0;

    while ((index=str.indexOf(target,index)) != -1) {
      count++;
      index += target.length();
    }

    System.out.println("指定字串" + target + "共出現" + count +"次");
  }
}
