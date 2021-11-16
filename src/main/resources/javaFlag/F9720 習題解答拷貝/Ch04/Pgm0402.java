public class Pgm0403 {
	public static void main(String[] argv) {
		int coin10; // 10 元硬幣數量
		int coin5; // 5 元硬幣數量
		int coin1; // 1元硬幣數量
		int price = 137; // 票價
		
		coin10 = price / 10;
		price %= 10;
		coin5 = price / 5;
		coin1 = price % 5;
		
		System.out.println("共需 " + coin10 + " 枚 10 元硬幣");
		System.out.println(coin5 + " 枚 5 元硬幣");
		System.out.println(coin1 + " 枚 1 元硬幣");
	}
}