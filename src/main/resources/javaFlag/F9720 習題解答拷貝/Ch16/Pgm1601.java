import java.io.*;

public class Pgm1601 {

  public static void main(String args[]) throws IOException {

    BufferedWriter bw =
      new BufferedWriter(new FileWriter("NineNine"));

    // 宣告九九乘法表的 (x*y) 變數 x 及 y
    int x, y;

    for (x=1;x<=9;x++) {
      for (y=1;y<=9;y++) {
        String str = new String(x + "*" + y + "=" + x*y + "\t");
        bw.write(str,0,str.length());
      }
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}
