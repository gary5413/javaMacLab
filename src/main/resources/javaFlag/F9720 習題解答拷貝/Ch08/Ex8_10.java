public class Ex8_10 {

	public static void main(String[] argv) {
		for(int i = 999;i < 1999;i++) {
			if(i % 39 == 0) {
				break;
			}
		}
		System.out.println("大於999的39的倍數是：" + i);
	}
}
