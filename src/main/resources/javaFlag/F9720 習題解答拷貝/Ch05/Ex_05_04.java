import java.io.*;

public class Ex_05_04 {

	public static void main(String[] argv)
		throws IOException {
		System.out.println("�п�J���N��ơG");
		System.out.print("��");
		
		BufferedReader br = new 
			BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		int num2 = 1000;
		if (num1 > num2)
  		System.out.println("��J���ƭȤj��1000");
		else
  		System.out.println("��J���ƭȤp��ε���1000");
	}
}
