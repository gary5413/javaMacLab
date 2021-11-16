public class Ex06_08 {
  public static void main(String args[]) {
    int i, sum=0;
    for (i=2;i<9;i++) {
      if ((i%2) == 0) {
        sum = sum + i;
        System.out.println(sum);
      }
      else continue;
    }
  }
}
