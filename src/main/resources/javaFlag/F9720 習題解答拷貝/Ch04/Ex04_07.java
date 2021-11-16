public class Ex04_07  {
	public static void main(String[] argv) {
		int i = 3;
		i = (i == 3 | (++i == 4)) ? i * 2 : 0;
		System.out.println("變數 i 現在的內容：" + i);
	}
}
