public class Ex14_08 {
  public void main(String argv[]){
    int[] a = {10,20,30,40};

    try {
      for(int i=0; i<= a.length; i++)
        System.out.println("a[" + i + "]：" + a[i]);
    }
    catch (OutOfBoundsException e) {
      System.out.println("發生例外：" + e);
      System.out.println("也就是超出陣列範圍了!");
    }
  }
}
