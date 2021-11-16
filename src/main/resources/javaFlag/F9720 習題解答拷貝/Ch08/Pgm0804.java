class Mathematics {
	public int arraySum(int[] elements) {
		int total = 0;
		for(int i : elements)
			total += i;
		return total;
	}
}

public class Pgm0804 {
	public static void main(String[] argv) {
		int[] elements = {2,4,5,6,7};
		Mathematics math = new Mathematics();
		System.out.print("陣列內容：");
		for(int i : elements)
			System.out.print(i + " ");
		System.out.println("\n加總值為：" + math.arraySum(elements));
	}
}