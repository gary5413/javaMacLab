import java.util.*;

public class Pgm1708 {

  public static void main(String args[]) {

    String[] suit = {"�®�", "����", "���", "����"};
    String[] list = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

    ArrayList<String> num = new ArrayList<>();
    for (int i=0;i<4;i++)     // ��l�ƶ��X������
      for (int j=0;j<13;j++)
        num.add(suit[i]+list[j]);

    Collections.shuffle(num);

    for(int i=1;i<5;i++) {
      System.out.print("\n��" +i+ "�쪱�a��W���P�O�G");
      System.out.println(num.subList((i-1)*13,i*13));
    }
  }
}

