public class Pgm0707 {
	public static void main(String[] argv) {
		int max = 100; // 找1..max之間的質數
		boolean[] seive = new boolean[max + 1];
		
		for(int i = 1;i < seive.length;i++)
			seive[i] = true;
			
		for(int i = 2;i < max;i++)
			for(int j = 2;i * j <= max;j++)
				seive[i * j] = false;
				
		System.out.println("1.." + max + "之間的質數如下：");
		for(int i = 2;i < seive.length;i++)
			if(seive[i])
				System.out.print(i + " ");
		
	}
}
