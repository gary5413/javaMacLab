import java.io.*;

public class Pgm1603 {

  public static void main(String args[]) throws IOException {

    System.out.println("顯示中文字元的Big-5碼");
    System.out.print("請輸入一個中文字元：");
    int upper =  System.in.read();   // 中文字元佔兩個位元組，
    int lower =  System.in.read();   // 所以要連讀兩次

    System.out.println("Big-5碼是："
                + Integer.toHexString(upper)    // 轉換成 16 進位表示
                + Integer.toHexString(lower));
  }
}
