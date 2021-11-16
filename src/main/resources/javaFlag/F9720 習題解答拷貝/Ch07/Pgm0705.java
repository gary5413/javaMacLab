public class Pgm0705 {
	public static void main(String[] argv) {
		int[] a = {30,20,10,5,34,44};

		System.out.println("原始陣列內容：");
		for(int i : a) 
			System.out.print(i + " ");

		int result = 0;
		for(int i : a)
			result += i * i * i;		
		
		System.out.println("\n全部元素立方和：" + result);
	}
}
