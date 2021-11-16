public class Pgm0708 {

	public static void main(String[] argv) {
		int[] data = new int[argv.length]; // ㄌ沮㏑把计计皌竚
		
		for(int i = 0;i < argv.length;i++)
			data[i] = Integer.parseInt(argv[i]); // 盢㏑把计锣传Θ俱计皚
			
		int temp; // ノㄓユ传じ既跑计

		for(int i = 0;i < data.length - 1;i++) {
			// 惠秈︽じ计-1近
			for(int j = 0;j < data.length - 1 - i;j++ ) {
				// 材i近ゑ癸计材i+1じ
				if(data[j] < data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}

			for(int k:data) {
				System.out.print(" " + k);
			}
			System.out.println("");
		}
	}
}
