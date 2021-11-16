import java.io.*;

public class Pgm1001 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // 記錄使用者輸入資料
		boolean isID; // 使用者輸入的格式是否正確
		do {
			isID = true;
			System.out.print("請輸入身份證字號：");
			str = br.readLine(); // 讀取使用者輸入資料			
			
			if(str.length() == 10) {
				char curr = str.toUpperCase().charAt(0);// 取第一個字母
				if(curr >= 'A' && curr <= 'Z') { // 第一個是字母
					for(int i = 1;i <= 9;i++) {
						curr = str.charAt(i); // 依序取出數字
						if(curr < '0' || curr > '9') { // 不是數字
							isID = false;
							break;
						}
					}
				}
				else
					isID = false;
			}
			else
				isID = false;
						
			if(!isID) { // 不正確
				System.out.println(
					"身份證字號應該是1個英文字母接著9個數字！");
			}
		} while (!isID);
	}
}
		
