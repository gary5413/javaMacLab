import java.util.*;

public class Pgm0409 {
	public static void main(String[] argv) {
		System.out.print("請輸入任意整數:");
    
    // 取得輸入
		Scanner sc=new Scanner(System.in);
    int x = sc.nextInt();
		
		System.out.println(x+ "是" + ((x%2)==0 ? "偶數" : "奇數" ));
	}
}