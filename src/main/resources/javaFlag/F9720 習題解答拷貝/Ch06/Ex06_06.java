public class Ex06_06 {

  public static void main(String args[]) {

    // 宣告累加值 sum 及計算範圍 range
    int sum;

    for (sum=0;sum<10;sum++)
      sum = sum + 1;
    System.out.println("sum = " +sum);

    for (sum=0;sum<10;sum++) {
      sum= sum + 1;
      break;
    }
    System.out.println("sum = " +sum);

    for (int i=0;i<10;i++)
      sum = sum + i;
//  break;
    System.out.println("sum = " +sum);

    sum = 0;
    for (int i=0;i<10;i++) {
      continue;
//    sum = sum + i;
    }
    System.out.println("sum = " +sum);
  }
}
