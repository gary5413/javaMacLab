public class Pgm0407 {
	public static void main(String[] argv) {
		int c; // �����ƶq
		int r; // �ߪ��ƶq
		int heads = 8,legs = 26;
		
		r = (legs - 2 * heads) / 2;
		c = heads - r;
		System.out.println("���� " + c + "��");
		System.out.println("�ߦ� " + r + "��");
	}
}