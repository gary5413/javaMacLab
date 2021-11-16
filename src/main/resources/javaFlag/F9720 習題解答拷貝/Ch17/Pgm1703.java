import java.io.*;
import java.util.*;

public class Pgm1703 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, String> months = new TreeMap<>();  // �I�s�غc��k
    String[] monthName = {"January", "February", "March",
                          "April", "May", "June",
                          "July", "August", "September",
                          "October", "November", "December"};
    for (int i=1;i<=12;i++)
      months.put(Integer.toString(i),monthName[i-1]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // �ΰj�����ϥΪ̥i���Ƭd��
      System.out.println("�n�d���Ӥ몺�^���r");
      System.out.print("(������ Enter �i�����{��)->");
      str = br.readLine();
      if (str.equals(""))   // �Y�S�����e�N���X�j��
        break;
      System.out.println(str + "�몺�^��O" + months.get(str) + "\n");
    }
  }
}
