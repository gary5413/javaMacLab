import java.io.*;

public class Pgm1406 {

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
        System.out.println("與第一次輸入的不同！");
    }

    if (chance == -1)
        throw new RuntimeException("輸入三次錯誤！程式停止！");
    else
        System.out.println("密碼正確");
  }
}

