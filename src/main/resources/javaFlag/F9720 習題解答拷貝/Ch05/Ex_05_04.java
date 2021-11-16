import java.io.*;

public class Ex_05_04 {

	public static void main(String[] argv)
		throws IOException {
		System.out.println("請輸入任意整數：");
		System.out.print("→");
		
		BufferedReader br = new 
			BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		int num2 = 1000;
		if (num1 > num2)
  		System.out.println("輸入的數值大於1000");
		else
  		System.out.println("輸入的數值小於或等於1000");
	}
}
