class Reverter {
	void doReverse(int[] data,int index) {
		if(index == 0)
			return;
		int temp = data[index - 1];
		doReverse(data,index - 1);
		data[data.length - index] = temp;
	}
	
	void reverse(int[] data) {
		doReverse(data,data.length);
	}
}

public class Pgm0810 {

	public static void main(String[] argv) {

		// argv傳入要反轉的陣列
		int[] data = new int[argv.length];

		// 將傳入的資料轉為整數
		for(int i = 0;i < data.length;i++) {
			data[i] = java.lang.Integer.parseInt(argv[i]);
		}

		System.out.print("原始陣列：");
		for(int i : data)
			System.out.print(i + " ");
		// 反轉
		Reverter r = new Reverter();
		r.reverse(data);
		System.out.print("\n反轉後陣列：");
		for(int i : data)
			System.out.print(i + " ");
	}
}
