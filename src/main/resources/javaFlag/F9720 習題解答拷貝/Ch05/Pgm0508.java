import java.io.*;

public class Pgm0508 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�����G");
    System.out.print("��");
    String str = br.readLine();
    int height = Integer.parseInt(str);
    System.out.println("�п�J�ʧO(1)�k��(2)�k�͡G");
    System.out.print("��");
		str = br.readLine();
    int sex = Integer.parseInt(str);
    
    // �p���魫
    if(sex == 1) // �k��
    	System.out.println(height + " �������k�Ͳz�Q�魫�� " + (height - 80) * 0.7 + "����");
    else if(sex == 2)
    	System.out.println(height + " �������k�Ͳz�Q�魫�� " + (height - 70) * 0.6 + "����");
    else
    	System.out.println("���ةʧO�|�L�����i�p��");
	}
}