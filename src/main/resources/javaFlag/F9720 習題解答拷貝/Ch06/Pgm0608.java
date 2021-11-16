import java.io.*;

public class Pgm0608 {

  public static void main(String args[]) throws IOException {

    System.out.println("密碼輸入測試");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入密碼：");
    String pass = br.readLine();

    int chance = 3;
    while (chance-- > 0) {
      System.out.print("請再輸入一次密碼：");
      String pass2 = br.readLine();

      if (pass == pass2)
        break;
      else
        System.out.println("錯誤！");
    }

    if (chance == -1)
        System.out.println("輸入三次錯誤！程式停止！");
    else
        System.out.println("輸入正確");
  }
}
