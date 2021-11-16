import java.io.*;

public class Pgm1605 {

  public static void main(String args[]) throws IOException {

    System.out.println("要讀取的檔案名稱 (路徑)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);  // 建立 FileReader 物件
    FileWriter fw = new FileWriter("new");

    int ch;
    while ((ch=fr.read()) != -1) {  // 在讀到 -1 之前, 持續讀取
      if (ch>= 97 & ch<=122)
        ch -=32;        // 將小寫字母的字碼減 32 就變成大寫
      fw.write(ch);
    }
    fr.close();
    fw.close();
  }
}

