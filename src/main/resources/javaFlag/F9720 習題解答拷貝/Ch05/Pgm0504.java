import java.io.*;

public class Pgm0504 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�ƭȡG");
    System.out.print("��");
    String str = br.readLine();
    int a = Integer.parseInt(str);
    System.out.println("�п�J�ƭȡG");
    System.out.print("��");
		str = br.readLine();
    int b = Integer.parseInt(str);
    
    // �����Ӽƭ�
    if(a > b)
    	System.out.println(a + "��" + b + "�j");
    else if(a < b)
    	System.out.println(a + "��" + b + "�p");
    else
    	System.out.println(a + "����" + b);
    
    // ��ܹB��
    System.out.println("�п��(1)�[(2)��(3)��(4)��");
    System.out.print("��");
 		str = br.readLine();
    int choice = Integer.parseInt(str);
		
		switch(choice) {
			case 1:
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case 2:
				System.out.println(a + " - " + b + " = " + (a - b));
				break;
			case 3:
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case 4:
				System.out.println(a + " / " + b + " = " + (a / b));
				break;
			default:
				System.out.println("����F");
		}
	}
}