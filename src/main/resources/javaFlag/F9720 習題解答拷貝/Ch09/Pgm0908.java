class Calculator {
	public static int cubic(int i) {
		return i * i * i;
	}
	
	public static int factory(int i) {
		if(i <= 1)
			return 1;
		else
			return i * factory(i - 1);
	}
}

public class Pgm0908 {
	public static void main(String[] argv) {
		System.out.println("5���ߤ�Ȭ��G" + Calculator.cubic(5));
		System.out.println("5�������Ȭ��G" + Calculator.factory(5));
	}
}