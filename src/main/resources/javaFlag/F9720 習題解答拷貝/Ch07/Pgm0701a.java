public class Pgm0701a {
	public static void main(String[] argv) {
		int hours = 0;
		int fee = 0;

		// 轉換為 int
		hours = java.lang.Integer.parseInt(argv[0]);

		if(hours > 7) { // 先計算超過7小時的部分
			fee += (hours - 7) * 100;
			hours = 7;
		}

		if(hours > 3) { // 計算3~7小時的時段
			fee += (hours - 3) * 60;
			hours = 3;
		}

		if(hours > 0) { // 計算3小時內的時段
			fee += (hours - 0) * 30;
			hours = 0;
		}

		System.out.println("停車時數：" + argv[0] + "小時");
		System.out.println("應繳費用：" + fee + "元整");
	}
}
