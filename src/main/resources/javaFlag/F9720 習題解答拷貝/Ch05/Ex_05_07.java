public class Ex_05_07 {
	public static void main(String[] argv) {
		char grade = 'B';
		switch(grade) {
			case 'A':
				System.out.println("单A");
				break;
			case 'B':
				System.out.println("单B");
				break;
			case 'C':
				System.out.println("单C");
			default:
				System.out.println("单D");
		}
	}
}