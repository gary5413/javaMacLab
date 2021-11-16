public class Pgm0706 {
	public static void main(String[] argv) {
		int[] a = {20,30,40,50};
		int[] b = {1,3,0,2};
		int[] temp = new int[a.length]; // 暫存資料用的陣列

		System.out.println("原始陣列內容：");
		for(int i : a) 
			System.out.print(i + " ");
		System.out.println("\n位置陣列內容：");
		for(int i : b) 
			System.out.print(i + " ");
		
		for(int i = 0;i < a.length;i++) // 使用暫存陣列調換資料
			temp[b[i]] = a[i];

		for(int i = 0;i < a.length;i++) // 將資料放回原陣列
			a[i] = temp[i];

		System.out.println("\n處理後陣列內容：");
		for(int i : a) 
			System.out.print(i + " ");
	}
}
