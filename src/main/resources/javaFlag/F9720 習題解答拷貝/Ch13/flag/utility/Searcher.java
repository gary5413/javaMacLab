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
		if(low > high) { // �䤣��
			return -1;
		}

		int middle = (low + high) / 2; // ���o������������

		if(item == data[middle]) { // ���F
			return middle;
		}
		else if(item > data[middle]) { // �b�k�b��
			return binarySearch(middle + 1,high);
		}
		else { // �b���b��
			return binarySearch(low,middle - 1);
		}
	}
}
