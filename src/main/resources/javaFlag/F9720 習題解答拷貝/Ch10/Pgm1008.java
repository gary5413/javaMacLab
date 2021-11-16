import java.io.*;

public class Pgm1008 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入字串：");		
		String str =  br.readLine(); // 讀取使用者輸入資料	
		System.out.print("請輸入要取代的字元：");		
		String oldChar =  br.readLine(); // 讀取使用者輸入資料
		System.out.print("請輸入要取代成那個字元：");		
		String newChar =  br.readLine(); // 讀取使用者輸入資料
		System.out.println(myReplace(str,oldChar.charAt(0),newChar.charAt(0)));
		System.out.print("請輸入要取代的子字串：");		
		oldChar =  br.readLine(); // 讀取使用者輸入資料
		System.out.print("請輸入要取代成那個字串：");		
		newChar =  br.readLine(); // 讀取使用者輸入資料
		System.out.println(myReplace(str,oldChar,newChar));
	}
	
	static String myReplace(String str,char oldChar,char newChar) {
		int pos;
		int start = 0;
		String result = "";
		while(start < str.length()) {
			pos = str.indexOf(oldChar,start);
			if(pos == -1) {
				result = result + str.substring(start);
				break;
			}
			result = result + str.substring(start,pos) + newChar;
			start = pos + 1;
		}
		return result;
	}

	static String myReplace(String str,String oldStr,String newStr) {
		int pos;
		int start = 0;
		String result = "";
		while(start < str.length()) {
			pos = str.indexOf(oldStr,start);
			if(pos == -1) {
				result = result + str.substring(start);
				break;
			}
			result = result + str.substring(start,pos) + newStr;
			start = pos + oldStr.length();
		}
		return result;
	}
}
		
