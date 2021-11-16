import java.io.*;

public class Pgm0504 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("請輸入數值：");
    System.out.print("→");
    String str = br.readLine();
    int a = Integer.parseInt(str);
    System.out.println("請輸入數值：");
    System.out.print("→");
		str = br.readLine();
    int b = Integer.parseInt(str);
    
    // 比較兩個數值
    if(a > b)
    	System.out.println(a + "比" + b + "大");
    else if(a < b)
    	System.out.println(a + "比" + b + "小");
    else
    	System.out.println(a + "等於" + b);
    
    // 選擇運算
    System.out.println("請選擇(1)加(2)減(3)乘(4)除");
    System.out.print("→");
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
				System.out.println("選錯了");
		}
	}
}