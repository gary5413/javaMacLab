import java.io.*;

public class Pgm1609_Read {

  public static void main(String args[]) throws IOException, ClassNotFoundException {

    System.out.println("讀取通訊錄檔內容");
    System.out.print("讀輸入通訊錄檔名：");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // 取得檔名字串

    ObjectInputStream ois =                 // 建立物件輸入串流
      new ObjectInputStream(new FileInputStream(filename));

    try {
      while (true) {
        Pgm1609_Contact p = (Pgm_1609_Contact) ois.readObject();  // 讀入物件
        System.out.println(p);
      }
    } catch (EOFException e) {
      ois.close();
    }
  }
}


