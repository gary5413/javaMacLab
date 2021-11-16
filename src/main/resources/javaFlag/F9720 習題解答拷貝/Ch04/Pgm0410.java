import java.util.*;

public class Pgm0410 {
	public static void main(String[] argv) {
    System.out.println("攝氏->華氏換算");  
		System.out.print("請輸入要攝氏溫度:");
    
    // 取得輸入
		Scanner sc=new Scanner(System.in);
    int degree = sc.nextInt();
		
		System.out.println("攝氏" + degree+ "度等於華氏" + 
                    (degree*9.0/5+32) + "度" );
	}
}