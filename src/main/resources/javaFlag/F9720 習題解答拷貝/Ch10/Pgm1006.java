import java.io.*;

public class Pgm1006 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // 記錄使用者輸入資料
		boolean formatOK; // 使用者輸入的格式是否正確
		int year = 0,month = 0,day = 0;
		do {
			formatOK = false;
			System.out.print("請以YYYY/MM/DD或是MM/DD/YYYY的格式輸入日期：");
			str = br.readLine(); // 讀取使用者輸入資料			
			
			if(str.matches("\\d{2}/\\d{2}/\\d{4}")) { // MM/DD/YYYY
				month = Integer.parseInt(str.substring(0,2));
				day = Integer.parseInt(str.substring(3,5));
				year = Integer.parseInt(str.substring(6));
				formatOK = true;
			}
			else if(str.matches("\\d{4}/\\d{2}/\\d{2}")) { // YYYY/MM/DD/
				year = Integer.parseInt(str.substring(0,4));
				month = Integer.parseInt(str.substring(5,7));
				day = Integer.parseInt(str.substring(8));
				formatOK = true;
			}

			int daysOfMonth;
			if(formatOK) {
				if(month > 12)
					formatOK = false;
				else {
					if(month == 2)
						daysOfMonth = ((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0) ? 29 : 28;
					else if(month < 8)
						daysOfMonth = (month % 2 != 0) ? 31 : 30;
					else
						daysOfMonth = (month % 2 == 0) ? 31 :30;
					if(day > daysOfMonth)
						formatOK = false;
				}
			}
					
			if(!formatOK) { // 不正確
				System.out.println(
					"日期不正確！");
			}
		} while (!formatOK);
		System.out.println("您輸入的是西元" + year + "年" + month + "月" + day + "日");
	}
}
		
