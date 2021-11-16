public class Pgm0408 {
	public static void main(String[] argv) {
		int startH = 10; // 開始停車的整點
		int startM = 23; // 開始停車的分鐘
		int endH = 15; // 結束停車的整點
		int endM = 20; // 結束停車的分鐘
		int total = (endH * 60 + endM) - (startH * 60 + startM); // 停車總分鐘數
		
		// 各時段分鐘數
		int over4 = total - 4 * 60;
		over4 = (over4 > 0) ? over4 : 0;
		int over2 = total - over4 - 2 * 60;
		over2 = (over2 > 0) ? over2 : 0;
		int under2 = total - over4 - over2;
		
		// 停車費
		int fee = under2 / 30 * 30 + over2 / 30 * 40 + over4 / 30 * 60;
		
		System.out.println("總共停車費：" + fee + " 元");
	}
}