import java.io.*;

public class Pgm1004 {
	
	// 計算從 start 位置開始，str 字串中連續的數字個數
	static int countLetters(String str,int start) {
		char curr;
		int i;
		for(i = start;i < str.length();i++) {
			curr = str.charAt(i);
			if(curr < 'a' || curr > 'z')
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
			System.out.print("請輸入E-MAIL：");
			str = br.readLine(); // 讀取使用者輸入資料			
			
			int letters = countLetters(str,0);
			int pos;
			int subdomains = 0;
			if(letters > 0) { //
				pos = letters;
				if(str.charAt(pos) == '@') {
					letters = countLetters(str,++pos);
					if(letters > 0) {
						pos += letters;
						while(pos < str.length()) {
							formatOK = false;
							if(str.charAt(pos) == '.') {
								letters = countLetters(str,++pos);
								if(letters > 0) {
									formatOK = true;
									pos += letters;
								}
								else
									break;
							}
							else
								break;
						}
					}
				}
			}
						
			if(!formatOK) { // 不正確
				System.out.println(
					"電子郵件應該是XXX@XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
