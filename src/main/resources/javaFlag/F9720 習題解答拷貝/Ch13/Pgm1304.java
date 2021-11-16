import java.io.*;
import flag.utility.CheckID;

public class Pgm1304 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		boolean isID = false;
		String str; // 記錄使用者輸入資料
		do {
			System.out.print("請輸入身份證字號：");
			str = br.readLine(); // 讀取使用者輸入資料
			switch(CheckID.isValidID(str)) {
				case CheckID.WRONG_FORMAT:
					System.out.println("身份證號應該是英文字母開頭，跟著9個數字。");
					isID = false;
					break;
				case CheckID.INVALID_ID:
					System.out.println("身份證號錯誤。");
					isID = false;
					break;
				case CheckID.VALID_ID:
					System.out.println("檢核通過。");
					isID = true;
					break;
			}
		} while (!isID);
	}
}