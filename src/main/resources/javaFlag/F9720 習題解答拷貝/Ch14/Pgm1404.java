import java.io.*;

// �ŧi�ۭq���ҥ~���O
class IlleagleValue extends RuntimeException {

  public IlleagleValue (String s) {
    super(s);
  }
}

public class Pgm1404 {

  public static void main(String[] argv) throws IOException{

    System.out.println("�p��ʹ����D");

    int men = 0, buns = 0;  // �H�ƻP�C�Y��

    do {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      System.out.print("\n�п�J�`�H�ơG");
      String str = br.readLine();
      men = Integer.parseInt(str);

      System.out.print("�п�J�C�Y�ơG");
      str = br.readLine();
      buns = Integer.parseInt(str);
    } while (men<0 | buns<0); // ��J�t�Ȯ�, �|�ШϥΪ̭��s��J

    int bigmonks = 0, smallmonks = 0;

    try {
      // �Y (�C�Y��*3 - �`�H��) ����Q 8 �㰣, �Y�ߥX�ҥ~
      if ((((3*buns-men) % 8) !=0) | ((3*buns-men) / 8) <0)
        throw new IlleagleValue("���{�����Ҽ{�b�ӤH�����p�I");

      bigmonks = (3*buns-men) / 8;

      smallmonks = men - bigmonks;
      System.out.println("�j���� " + bigmonks + " �H");
      System.out.println("�p���� " + smallmonks + " �H");
    }
    catch (IlleagleValue e) {
       System.out.println("��J�ƭȦ��~�I");
       System.out.println(e);
    }
  }
}
