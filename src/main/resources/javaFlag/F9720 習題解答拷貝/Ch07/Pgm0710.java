public class Pgm0710 {

	public static void main(String[] argv) {
		int[] data = new int[argv.length]; // ㄌ沮㏑把计计皌竚
		
		for(int i = 0;i < argv.length;i++)
			data[i] = Integer.parseInt(argv[i]); // 盢㏑把计锣传Θ俱计皚
			
		for(int i = 0;i < data.length;i++) {
			if(i == data[i])
				System.out.println("ま絏" + i + "じ"  + data[i]);
		}
	}
}
