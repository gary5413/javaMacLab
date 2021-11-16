import java.io.*;

public class Pgm1610 {

  public static void main(String args[]) throws IOException {

    System.out.println("統一發票對獎程式");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] str =new String[4];

    System.out.print("請輸入特獎獎號：");
    str[0] = br.readLine();

    for (int i=1;i<str.length;i++) {
      System.out.print("請輸入第"+(i+1)+"組頭獎獎號：");
      str[i] = br.readLine();
    }

    compare(str);       // 呼叫比對號碼的方法
  }

  public static void compare(String[] prize) throws IOException {

    BufferedReader br =           // 建立檔案輸入串流物件
      new BufferedReader(new FileReader("invoice.txt"));

    String number = new String();  //用來記錄每張發票的號碼

    try {
      next:while ((number = br.readLine()) != null) {

        // 比對特獎
        if (number.equals(prize[0])) {
          System.out.println(number + "這張發票中了特獎！");
          continue next;        // 這張中獎了, 換下一張發票繼續對獎
        }

        // 比對三組頭獎
        for (int i=1;i<prize.length;i++) {

          // 比對同一獎號的全部號碼...到末三碼
          for (int j=0;j<=5;j++)
            if ( (number.substring(j)).equals (prize[i].substring(j)) ) {
              if (j==0)
                System.out.println(number + "這張發票中了頭獎！");
              else
                System.out.println(number + "這張發票中了" + (j+1) + "獎！");
              continue next;    // 這張中獎了, 換下一張發票繼續對獎
            }
        }
      }
    } catch (EOFException e) { }
  }
}