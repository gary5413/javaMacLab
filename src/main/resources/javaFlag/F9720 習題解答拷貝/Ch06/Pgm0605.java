public class Pgm0605 {

  public static void main(String args[]) {

    int sum = 0, i; // 宣告累加值 sum 與迴圈變數 i

    System.out.println("1到100間屬於5或7的倍數的整數有：");
    for (i=1;i<=100;i++)  // 跑 100 次的 for 迴圈
      if (i%5==0 | i%7==0)
        System.out.print(i + "\t");
  }
}
