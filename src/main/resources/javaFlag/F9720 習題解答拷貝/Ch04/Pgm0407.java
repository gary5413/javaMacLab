public class Pgm0407 {
	public static void main(String[] argv) {
		int c; // 雞的數量
		int r; // 兔的數量
		int heads = 8,legs = 26;
		
		r = (legs - 2 * heads) / 2;
		c = heads - r;
		System.out.println("雞有 " + c + "隻");
		System.out.println("兔有 " + r + "隻");
	}
}