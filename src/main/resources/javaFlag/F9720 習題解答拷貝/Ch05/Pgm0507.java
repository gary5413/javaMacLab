import java.io.*;

public class Pgm0507 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

		double discount = 1.0; // �馩
    System.out.println("�п�J�q�ܤ����ơG");
    System.out.print("��");

    String str = br.readLine();
    int minutes = Integer.parseInt(str);

		if(minutes >= 1500)
			discount = .79; // 79 ��
		else if(minutes >= 800)
			discount = .9; // 9 ��
		System.out.println(minutes + "�������q�ܶO�ά��G" + (minutes * 0.9 * discount));
	}
}