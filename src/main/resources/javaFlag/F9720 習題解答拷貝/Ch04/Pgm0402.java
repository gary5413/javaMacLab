public class Pgm0403 {
	public static void main(String[] argv) {
		int coin10; // 10 ���w���ƶq
		int coin5; // 5 ���w���ƶq
		int coin1; // 1���w���ƶq
		int price = 137; // ����
		
		coin10 = price / 10;
		price %= 10;
		coin5 = price / 5;
		coin1 = price % 5;
		
		System.out.println("�@�� " + coin10 + " �T 10 ���w��");
		System.out.println(coin5 + " �T 5 ���w��");
		System.out.println(coin1 + " �T 1 ���w��");
	}
}