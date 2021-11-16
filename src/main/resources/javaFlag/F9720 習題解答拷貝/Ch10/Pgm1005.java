import java.io.*;

public class Pgm1005 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // 記錄使用者輸入資料
		boolean formatOK; // 使用者輸入的格式是否正確
		do {
			formatOK = false;
			System.out.print("請輸入E-MAIL：");
			str = br.readLine(); // 讀取使用者輸入資料			
			
			formatOK = str.matches("[a-z]+@[a-z]+(\\.[a-z]+)+");
			if(!formatOK) { // 不正確
				System.out.println(
					"電子郵件應該是XXX@XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
