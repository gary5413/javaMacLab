import java.io.*;
import java.util.*;

public class Pgm1709 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, String> stuList = new TreeMap<>();  // �I�s�غc��k
    String[] students = {"1230", "�iݵ��",
                         "1231", "����­",
                         "1232", "�J����",
                         "1233", "���o�G",
                         "1234", "���곹"};
    for (int i=0;i<10;i+=2)
      stuList.put(students[i],students[i+1]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // �ΰj�����ϥΪ̥i���Ƭd��
      System.out.println("�n�d���ӾǸ����ǥ�");
      System.out.print("(������ Enter �i�����{��)->");
      str = br.readLine();
      if (str.equals(""))   // �Y�S�����e�N���X�j��
        break;
      if(stuList.containsKey(str))
        System.out.println("�Ǹ�"+ str + "���ǥͬO" + stuList.get(str) + "\n");
      else
        System.out.println("�S���o�ӾǸ��I\n");
    }
  }
}
