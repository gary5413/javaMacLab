import java.util.*;

public class Pgm0410 {
	public static void main(String[] argv) {
    System.out.println("���->�ؤ󴫺�");  
		System.out.print("�п�J�n���ū�:");
    
    // ���o��J
		Scanner sc=new Scanner(System.in);
    int degree = sc.nextInt();
		
		System.out.println("���" + degree+ "�׵���ؤ�" + 
                    (degree*9.0/5+32) + "��" );
	}
}