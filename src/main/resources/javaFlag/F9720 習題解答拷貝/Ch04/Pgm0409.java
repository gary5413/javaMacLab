import java.util.*;

public class Pgm0409 {
	public static void main(String[] argv) {
		System.out.print("叫块ヴ種俱计:");
    
    // 眔块
		Scanner sc=new Scanner(System.in);
    int x = sc.nextInt();
		
		System.out.println(x+ "琌" + ((x%2)==0 ? "案计" : "计" ));
	}
}