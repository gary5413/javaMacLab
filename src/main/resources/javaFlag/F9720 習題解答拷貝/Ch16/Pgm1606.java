import java.io.*;

public class Pgm1606 {

  public static void main(String args[]) throws IOException {

    System.out.println("複製檔案的程式");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入來源檔路徑及檔名：");
    String str = br.readLine();           // 取得檔名字串
    FileInputStream fr = new FileInputStream(str);

    System.out.print("請輸入目的檔路徑及檔名：");
    str = br.readLine();           // 取得檔名字串
    FileOutputStream fw = new FileOutputStream(str);

    int data;
    while ((data = fr.read()) != -1)
      fw.write(data);

    fr.close();
    fw.close();
  }
}
