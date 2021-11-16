import java.io.*;

public class Pgm1707 {

  public static void main(String args[]) throws IOException {

    char[] op={'+','-','*','/','^'}; // �� ^ �N����

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�B�⦡(��^�N����)�G");
    String str = br.readLine();

    int i,mid;
    for(i=0;i<5;i++) {
      if((mid=str.indexOf(op[i]))==-1)
        continue;
      else {
        int op1 = Integer.valueOf(str.substring(0,mid),2);
        int op2 = Integer.valueOf(str.substring(mid+1),2);

        switch(i) {
          case 0:
            System.out.print(str + "=" + (op1+op2));
            output(op1+op2);
            break;
          case 1:
            System.out.print(str + "=" + (op1-op2));
            output(op1-op2);
            break;
          case 2:
            System.out.print(str + "=" + (op1*op2));
            output(op1*op2);
            break;
          case 3:
            System.out.print(str + "=" + (op1/op2));
            output(op1/op2);
            break;
          case 4:
            System.out.print(str + "=" + Math.pow(op1,op2));  
            output((long)Math.pow(op1,op2));
        }
        break;
      }
    }

    if (i>=5)
      System.out.print("��J���⦡���~�I");
  }
  
  public static void output(long value) {
    System.out.println("\n 16�i��G" + Long.toHexString(value) +
                       "\n  8�i��G" + Long.toOctalString(value) +
                       "\n  2�i��G" + Long.toBinaryString(value));
    
  }
}

