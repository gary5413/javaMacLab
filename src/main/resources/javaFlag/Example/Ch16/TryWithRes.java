import java.io.*;

public class TryWithRes {

  public static void main(String args[]) throws IOException {

    System.out.println("請輸入存放機率資料的檔案名稱");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();        // 取得檔名字串

    double hopeless;

    try (DataInputStream din =
           new DataInputStream (
             new BufferedInputStream(
               new FileInputStream(filename))) ){
      while (true) {
        System.out.printf("%d 取 6 共有%9.0f種排列組合,",
          din.readInt(), (hopeless = din.readDouble()));
        System.out.format(" 猜中機率為%15.12f\n", 1/hopeless);
        din.skipBytes (12);      // 每讀一筆記錄就跳過一筆記錄
      }                          // 整數佔 4 個, 浮點數佔 8 個位元組
    }
    catch (EOFException e) {        // 捕捉已到檔案結尾的例外
        System.out.println("已到檔案結尾!");
    }
  }
}
