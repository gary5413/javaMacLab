class Mathematics {
	public double arraySum(int[] elements) {
		int total = 0;
		for(int i : elements)
			total += i;
		return total / (double)elements.length;
	}

	public double arraySum(double[] elements) {
		double total = 0;
		for(double i : elements)
			total += i;
		return total / elements.length;
	}
}

public class Pgm0805 {
	public static void main(String[] argv) {
		int[] elements1 = {2,4,5,6,7};
		double[] elements2 = {2.3,4.5,5.7,6.8,7.0};
		Mathematics math = new Mathematics();
		System.out.print("陣列內容：");
		for(int i : elements1)
			System.out.print(i + " ");
		System.out.println("\n加總值為：" + math.arraySum(elements1));
		System.out.print("陣列內容：");
		for(double i : elements2)
			System.out.print(i + " ");
		System.out.println("\n加總值為：" + math.arraySum(elements2));
	}
}