import java.io.*;

public class Pgm0501 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("請輸入一個數值：");
    System.out.print("→");

    String str = br.readLine();
    int num = Integer.parseInt(str);
    
    if(num % 2 == 0)
    	System.out.println("偶數");
    else
    	System.out.println("奇數");
	}
}