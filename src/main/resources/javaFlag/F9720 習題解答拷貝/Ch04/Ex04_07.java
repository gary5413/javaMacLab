public class Ex04_07  {
	public static void main(String[] argv) {
		int i = 3;
		i = (i == 3 | (++i == 4)) ? i * 2 : 0;
		System.out.println("�ܼ� i �{�b�����e�G" + i);
	}
}
