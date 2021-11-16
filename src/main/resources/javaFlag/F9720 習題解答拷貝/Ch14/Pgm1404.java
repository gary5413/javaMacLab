import java.io.*;

// 宣告自訂的例外類別
class IlleagleValue extends RuntimeException {

  public IlleagleValue (String s) {
    super(s);
  }
}

public class Pgm1404 {

  public static void main(String[] argv) throws IOException{

    System.out.println("計算百僧問題");

    int men = 0, buns = 0;  // 人數與饅頭數

    do {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      System.out.print("\n請輸入總人數：");
      String str = br.readLine();
      men = Integer.parseInt(str);

      System.out.print("請輸入饅頭數：");
      str = br.readLine();
      buns = Integer.parseInt(str);
    } while (men<0 | buns<0); // 輸入負值時, 會請使用者重新輸入

    int bigmonks = 0, smallmonks = 0;

    try {
      // 若 (饅頭數*3 - 總人數) 不能被 8 整除, 即拋出例外
      if ((((3*buns-men) % 8) !=0) | ((3*buns-men) / 8) <0)
        throw new IlleagleValue("本程式不考慮半個人的狀況！");

      bigmonks = (3*buns-men) / 8;

      smallmonks = men - bigmonks;
      System.out.println("大僧有 " + bigmonks + " 人");
      System.out.println("小僧有 " + smallmonks + " 人");
    }
    catch (IlleagleValue e) {
       System.out.println("輸入數值有誤！");
       System.out.println(e);
    }
  }
}
