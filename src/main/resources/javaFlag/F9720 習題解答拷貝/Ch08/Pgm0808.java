import java.io.*;

class Mathematics {
	void divideBy13(int n) {
		for(int i = 13;i <= n;i += 13)
			if(i % 13 == 0)
				System.out.println(i + "可被 13 整除");
	}
}

public class Pgm0808 {

	public static void main(String[] argv) throws IOException{
		Mathematics m = new Mathematics();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入 n：");
		int n = java.lang.Integer.parseInt(br.readLine());

		m.divideBy13(n);
	}
}
