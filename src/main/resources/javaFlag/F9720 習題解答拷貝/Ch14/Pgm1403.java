import java.io.*;

public class Pgm1403 {

  public static void main(String[] argv) throws IOException{

    System.out.println("�ܽd���ͨҥ~���p");
    System.out.println("1 ArithmeticException");
    System.out.println("2 IndexOutOfBoundsException");
    System.out.println("3 NullPointerException");
    System.out.println("4 NumberFormatException");
    System.out.print("�п�ܭn���ͪ��ҥ~�����G");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int choice = Integer.parseInt(str);

    demo(choice);
  }

  public static void demo(int etype) {
    switch(etype) {
      case 1:
        int a=0;
        a = 3/a;
        break;
      case 2:
        int[] intarray={0,1,2,3};
        intarray[8]=9;
        break;
      case 3:
        char[] chararray=new char[3];
        chararray=null;
        chararray[0]='a';
        break;
      case 4:
        int test = Integer.parseInt("3.14");
        break;
      default:
        System.out.print("�藍�_�I�L�����ءC");
    }
  }
}


