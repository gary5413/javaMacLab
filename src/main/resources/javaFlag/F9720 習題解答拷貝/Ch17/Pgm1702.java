import java.io.*;

public class Pgm1702 {

  public static void main(String args[]) throws IOException {

    System.out.println("�q�Ʀr�C��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    int count = 1;      // �O������ĴX��
    int secret=7;       // �H���Ʀr

    while (count<=5) {  // �@����
      do {
        secret = (int) (Math.random() * 13 + 1);
      } while (secret == 7); // ���H���Ʀr���|����7
      System.out.println("�вq�����Ʀr��7�j�Τ�7�p�H");
      System.out.print("�q��7�j�h��J1�A�q��7�p��J0�G");
      String str = br.readLine();
      int guess = Integer.parseInt(str);

      if (guess == 0)           // �q�� 7 �p
        if ( Math.max(7,secret) == 7) {
          System.out.println("����F�I�����Ʀr�O"+secret+"�A�i�J�U�@���C");
          count++;
        } else {
          System.out.println("�����F�I�����Ʀr�O"+secret+"�A�U���A�ӡC");
          break;
        }
      else if (guess == 1)
        if ( Math.min(7,secret) == 7) {
          System.out.println("����F�I�����Ʀr�O"+secret+"�A�i�J�U�@���C");
          count++;
        } else {
          System.out.println("�����F�I�����Ʀr�O"+secret+"�A�U���A�ӡC");
          break;
        }
      else
        System.out.println("�u���J1��0�I");
    }

    if (count > 5)
      System.out.print("���߹L�����I");
  }
}
