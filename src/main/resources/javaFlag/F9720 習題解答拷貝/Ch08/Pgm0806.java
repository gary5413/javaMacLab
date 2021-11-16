import java.io.*;

class Mathematics {
	double dividesum(int n) {
		double result = 0.0;
		for(int i = 1;i <= n;i++)
			result += 1 / (double)i;
		return result;
	}
}

public class Pgm0806 {

	public static void main(String[] argv) throws IOException{
		Mathematics m = new Mathematics();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("½Ð¿é¤J n¡G");
		int n = java.lang.Integer.parseInt(br.readLine());

		System.out.println(m.dividesum(n));
	}
}
