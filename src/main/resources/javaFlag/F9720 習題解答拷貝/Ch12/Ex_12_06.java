interface I1 {
	int i = 10;
}

interface I2 {
	int i = 20;
}


public class Ex_12_06 implements I1,I2 {
	public static void main(String[] argv) {
		System.out.println(i);
	}
}