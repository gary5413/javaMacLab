import java.io.*;
import java.util.*;

class Student {

  private String name;
  private int  height;
  private int  weight;

  public Student(String n, int h, int w) {
    name = n;
    height = h;
    weight = w;
  }

  public String toString() {
    return  name + ", ����" + height + "����, �魫" + weight + "����";
  }
}

public class Pgm1710 {

  public static void main(String args[]) throws IOException {

    TreeMap<String, Student> stuList = new TreeMap<>();  // �I�s�غc��k
    String[] number = {"1230", "1231", "1232", "1233", "1234", };
    Student[] stu = {new Student("�iݵ��", 170, 65),
                     new Student("����­", 172, 60),
                     new Student("�J����", 165, 58),
                     new Student("���o�G", 175, 70),
                     new Student("���곹", 168, 67)};

    for (int i=0;i<number.length;i++)
      stuList.put(number[i],stu[i]);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while(true) {       // �ΰj�����ϥΪ̥i���Ƭd��
      System.out.println("�d�߾ǥ͸��");
      System.out.print("�п�J�Ǹ����ǥ�(�� Enter �����{��)->");
      String str = br.readLine();
      if (str.equals(""))   // �Y�S�����e�N���X�j��
        break;

      if(stuList.containsKey(str))   // �Y���������Ǹ�
        System.out.println("�Ǹ�"+ str + "���ǥͬO" + stuList.get(str) + "\n");
      else                           // �Y�L�������Ǹ�
        System.out.println("�S���o�ӾǸ��I\n");
    }
  }
}

