import java.io.*;

class Mathematics {
	void divideBy13(int n) {
		for(int i = 13;i <= n;i += 13)
			if(i % 13 == 0)
				System.out.println(i + "�i�Q 13 �㰣");
	}
}

public class Pgm0808 {

	public static void main(String[] argv) throws IOException{
		Mathematics m = new Mathematics();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�п�J n�G");
		int n = java.lang.Integer.parseInt(br.readLine());

		m.divideBy13(n);
	}
}
