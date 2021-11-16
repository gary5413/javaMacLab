import java.io.*;

class Searcher {
	public static int binarySearch(int[] data,int item) {
		return doBinarySearch(data,item,0,data.length - 1);
	}

	private static int doBinarySearch(int[] data,int item,int low,int high) {
		if(low > high) { // �䤣��
			return -1;
		}

		int middle = (low + high) / 2; // ���o������������

		if(item == data[middle]) { // ���F
			return middle;
		}
		else if(item > data[middle]) { // �b�k�b��
			return doBinarySearch(data,item,middle + 1,high);
		}
		else { // �b���b��
			return doBinarySearch(data,item,low,middle - 1);
		}
	}
}

public class Pgm0902 {

	public static void main(String[] argv) throws IOException {
		System.out.print("�п�J�n�M�䪺���\n->");
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
    int target = java.lang.Integer.parseInt(br.readLine());

		int i = Searcher.binarySearch(new int[] {3,5,7,8,10,34,56},target);
		if(i == -1) {
			System.out.println("�䤣�� " + target);
		}
		else {
			System.out.println("�b�� " + i + "�Ӥ������ " + target );
		}
	}
}
