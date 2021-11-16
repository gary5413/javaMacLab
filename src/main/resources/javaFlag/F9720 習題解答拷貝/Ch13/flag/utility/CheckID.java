package flag.utility;

public class CheckID {
	public static final int WRONG_FORMAT = -1;
	public static final int INVALID_ID = -2;
	public static final int VALID_ID = 0;

	// return 0 :	success
	//       -1 : format error
	//       -2 : invalid id
	public static int isValidID(String str) {
		
		if(!str.matches("[a-zA-Z]\\d{9}")) { // 不正確
			return WRONG_FORMAT;
		}
		
		int[] letterNums = {10,11,12,13,14,15,16,
			17,34,18,19,20,21,22,
			35,23,24,25,26,27,28,
			29,32,30,31,33};
			
		str = str.toUpperCase(); // 先將第一個英文字母轉為大寫
		char letter = str.charAt(0); // 取出第一個字母
		// 將第一個字母查表後取代成數字
		str = letterNums[letter - 'A'] + str.substring(1);
		
		int total = str.charAt(0) - '0'; // 開始加總
		for(int i = 1;i < 10;i++) {
			total += (str.charAt(i) - '0') * (10 - i); // 依序加總
		}
		
		// 以10減去加總值之個位數後取個位數
		int checkNum = (10 - total % 10) % 10;
		
		//計算結果和最後一位數比較
		if(checkNum == (str.charAt(10) - '0')) {
			return VALID_ID;
		} else {
			return INVALID_ID;
		}
	}
}