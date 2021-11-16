import java.io.*;

class Searcher {
	public static int binarySearch(int[] data,int item) {
		return doBinarySearch(data,item,0,data.length - 1);
	}

	private static int doBinarySearch(int[] data,int item,int low,int high) {
		if(low > high) { // 找不到
			return -1;
		}

		int middle = (low + high) / 2; // 取得中間元素索引

		if(item == data[middle]) { // 找到了
			return middle;
		}
		else if(item > data[middle]) { // 在右半邊
			return doBinarySearch(data,item,middle + 1,high);
		}
		else { // 在左半邊
			return doBinarySearch(data,item,low,middle - 1);
		}
	}
}

public class Pgm0902 {

	public static void main(String[] argv) throws IOException {
		System.out.print("請輸入要尋找的資料\n->");
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
    int target = java.lang.Integer.parseInt(br.readLine());

		int i = Searcher.binarySearch(new int[] {3,5,7,8,10,34,56},target);
		if(i == -1) {
			System.out.println("找不到 " + target);
		}
		else {
			System.out.println("在第 " + i + "個元素找到 " + target );
		}
	}
}
