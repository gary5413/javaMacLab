package flag.utility;

public class Searcher {
	private int[] data;
	private int item;
	public int search(int[] data,int item) {
		this.data = data;
		this.item = item;
		return binarySearch(0,data.length - 1);
	}

	private int binarySearch(int low,int high) {
		if(low > high) { // 找不到
			return -1;
		}

		int middle = (low + high) / 2; // 取得中間元素索引

		if(item == data[middle]) { // 找到了
			return middle;
		}
		else if(item > data[middle]) { // 在右半邊
			return binarySearch(middle + 1,high);
		}
		else { // 在左半邊
			return binarySearch(low,middle - 1);
		}
	}
}
