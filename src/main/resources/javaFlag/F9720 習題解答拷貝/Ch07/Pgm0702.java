import java.io.*;

public class Pgm0702 {
  public static void main(String[] argv) {
    int[] data = new int[19]; // �x�s�Y���I�ƥX�{����
    int base=0;
    for(int i=1;i<=6;i++)     // 3 �Ӱj����O�N�� 3 �ӻ�l
      for(int j=1;j<=6;j++)   // i+j+k �N�O�Y�X���I��
        for(int k=1;k<=6;k++) { 
          data[i+j+k]++;        // �N�N���ƪ������[ 1
          base++;               // �֥[����
        }

    for(int point=0;point<data.length;point++)
      if(data[point]>0)
        System.out.println("�Y�X"+ point + "�I�����v��" +
                           base+ "����" + data[point]);
  }  
}
