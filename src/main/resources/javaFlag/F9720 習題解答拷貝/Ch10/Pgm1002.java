import java.io.*;

public class Pgm1002 {
	
	// 計算從 start 位置開始，str 字串中連續的數字個數
	static int countDigits(String str,int start) {
		char curr;
		int i;
		for(i = start;i < str.length();i++) {
			curr = str.charAt(i);
			if(curr < '0' || curr > '9')
				break;
		}
		return i - start;
	}

	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // 記錄使用者輸入資料
		boolean formatOK; // 使用者輸入的格式是否正確
		do {
			formatOK = false;
			System.out.print("請輸入電話號碼：");
			str = br.readLine(); // 讀取使用者輸入資料			
			
			if(str.charAt(0) == '(') {
				int digits = countDigits(str,1);
				if(digits >= 2 && digits <= 3) { // 區域號碼為2位或3位
					if(str.charAt(1 + digits) == ')') {
						if(str.charAt(2 + digits) == '-') {
							digits = countDigits(str,3 + digits);
							if(digits >= 7 && digits <= 8) // 電話號碼為7位或8位
								formatOK = true;
						}
					}
				}
			}
						
			if(!formatOK) { // 不正確
				System.out.println(
					"電話號碼應該是(XX)-XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
