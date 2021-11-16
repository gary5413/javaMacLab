import java.io.*;

public class Pgm1702 {

  public static void main(String args[]) throws IOException {

    System.out.println("猜數字遊戲");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    int count = 1;      // 記錄玩到第幾關
    int secret=7;       // 隨機數字

    while (count<=5) {  // 共五關
      do {
        secret = (int) (Math.random() * 13 + 1);
      } while (secret == 7); // 讓隨機數字不會等於7
      System.out.println("請猜神秘數字比7大或比7小？");
      System.out.print("猜比7大則輸入1，猜比7小輸入0：");
      String str = br.readLine();
      int guess = Integer.parseInt(str);

      if (guess == 0)           // 猜比 7 小
        if ( Math.max(7,secret) == 7) {
          System.out.println("答對了！神秘數字是"+secret+"，進入下一關。");
          count++;
        } else {
          System.out.println("答錯了！神秘數字是"+secret+"，下次再來。");
          break;
        }
      else if (guess == 1)
        if ( Math.min(7,secret) == 7) {
          System.out.println("答對了！神秘數字是"+secret+"，進入下一關。");
          count++;
        } else {
          System.out.println("答錯了！神秘數字是"+secret+"，下次再來。");
          break;
        }
      else
        System.out.println("只能輸入1或0！");
    }

    if (count > 5)
      System.out.print("恭喜過五關！");
  }
}
