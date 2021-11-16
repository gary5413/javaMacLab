class Utility {
	public static int sum(int... numbers) {
		int total = 0;
		for(int i : numbers) { // 一一取出各個整數
			total += i;
		}
		
		return total;
	}
}

public class Pgm1104 {
	public static void main(String[] argv) {
		System.out.println("1 + 3 + 5 + 7 + 9 = " + Utility.sum(1,3,5,7,9));
	}
}