import java.io.*;

public class Pgm_1609 {

  public static void main(String args[]) throws IOException {

    System.out.print("要建立的通訊錄檔名：");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();
    ObjectOutputStream oos =           // 建立物件輸入串流物件
      new ObjectOutputStream(new FileOutputStream(filename));

    do {
      System.out.print("請輸入姓名：");
      String str1 = br.readLine();
      System.out.print("請輸入電話：");
      String str2 = br.readLine();
      System.out.print("請輸入電子信箱：");
      String str3 = br.readLine();
      Pgm1609_Contact person = new Pgm1609_Contact(str1,str2,str3);

      oos.writeObject(person);

      System.out.print("還要輸入另一筆資料嗎 (y/n)：");
    } while (br.readLine().equalsIgnoreCase("Y")); // 回答 Y/y 即再執行一次迴圈

    oos.flush();
    oos.close();

    System.out.println("\n已將資料寫入檔案 " + filename);
  }
}
