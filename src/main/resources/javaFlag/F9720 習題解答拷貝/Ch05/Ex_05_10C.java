public class Ex_05_10c {
	public static void main(String[] argv) {
		if (money > 50000) {
			switch (money) {
				case 51000:
					System.out.println("本月取得基本工資 51000 元");
					break;
				case 52000:
					System.out.println("本月工時過多, 辛苦了。");
					break;
					default:
				System.out.println("多休息, 小心過勞死。");
			}
		else
			System.out.println("您請假過多, 以致薪資過少。");
	}
}
