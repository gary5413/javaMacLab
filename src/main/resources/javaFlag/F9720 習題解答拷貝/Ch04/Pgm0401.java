public class Pgm0401 {
	public static void main(String[] argv) {
		int i = 10;
		
		if(i < 31) {
			System.out.println("2^^i ���Ȭ� " + (2 << (i - 1)));
		}
	}
}