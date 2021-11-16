import java.io.*;

public class Pgm1003 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // 記錄使用者輸入資料
		boolean formatOK; // 使用者輸入的格式是否正確
		do {
			System.out.print("請輸入電話號碼：");
			str = br.readLine(); // 讀取使用者輸入資料
			
			formatOK = str.matches("\\(\\d{2,3}\\)-\\d{7,8}");
			if(!formatOK) { // 不正確
				System.out.println(
					"電話號碼應該是(XX)-XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
