import java.util.*;

public class Pgm0409 {
	public static void main(String[] argv) {
		System.out.print("�п�J���N���:");
    
    // ���o��J
		Scanner sc=new Scanner(System.in);
    int x = sc.nextInt();
		
		System.out.println(x+ "�O" + ((x%2)==0 ? "����" : "�_��" ));
	}
}