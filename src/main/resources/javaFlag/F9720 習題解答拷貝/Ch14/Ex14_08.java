public class Ex14_08 {
  public void main(String argv[]){
    int[] a = {10,20,30,40};

    try {
      for(int i=0; i<= a.length; i++)
        System.out.println("a[" + i + "]�G" + a[i]);
    }
    catch (OutOfBoundsException e) {
      System.out.println("�o�ͨҥ~�G" + e);
      System.out.println("�]�N�O�W�X�}�C�d��F!");
    }
  }
}
