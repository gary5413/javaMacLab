public class Pgm0601 {

  public static void main(String args[]) {

    int sum = 0, i; // 宣告累加值 sum 與迴圈變數 i

    for (i=1;i<=100;i++)  // 跑 100 次的 for 迴圈
      if (i%3==0)         // 只累加能被3整除的數
        sum += i;
    System.out.println("1-100間所有3的倍數的總和為" + sum);
  }
}
