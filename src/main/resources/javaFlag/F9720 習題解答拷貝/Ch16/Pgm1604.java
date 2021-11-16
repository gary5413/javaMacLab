import java.io.*;

public class Pgm1604 {

  public static void main(String args[]) throws IOException {

    System.out.println("要讀取的檔案名稱 (路徑)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);  // 建立 FileReader 物件

    System.out.println("此檔案共含有：");
    int ch;
    int[] count=new int[256];
    while ((ch=fr.read()) != -1)    // 在讀到 -1 之前, 持續讀取
      count[ch]++;

    long charsum=0;
    for (int i=65;i<91;i++) {
      System.out.print((char) i + "有" +count[i] + "個，");
      charsum +=count[i];
      System.out.print((char) (i+32) + "有" +count[i+32] + "個，");
      charsum +=count[i+32];
      if (i%2 == 0)
        System.out.println();
    }
    System.out.println("所有英文字母共" + charsum + "個");
    fr.close();
  }
}
