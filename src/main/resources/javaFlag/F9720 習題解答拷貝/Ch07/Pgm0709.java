public class Pgm0709 {

	public static void main(String[] argv) {
		int[][] hourFeeTable = {{0,2,4,6}, // 時段
														{30,50,80,100}}; // 時段費率
		int hours = 0; //停車時數
		int fee = 0; //停車費用

		// 轉換為 int
		hours = java.lang.Integer.parseInt(argv[0]);

		int i = hourFeeTable[0].length - 1;
		while(i > 0) {// 先找出最高費率區段
			if(hourFeeTable[0][i] < hours)
				break;
			i--;
		}

		while(i >= 0) { // 由最高費率區段往下累加
			fee += (hours - hourFeeTable[0][i]) * hourFeeTable[1][i];
			hours = hourFeeTable[0][i];
			i--;
		}

		System.out.println("停車時數：" + argv[0] + "小時");
		System.out.println("應繳費用：" + fee + "元整");
	}
}
