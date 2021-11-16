import java.io.*;

class Mathematics {
	int sum(int n) {
		int result = 0;
		for(int i = 1;i <= n;i++)
			result += i;
		return result;
	}
}

public class Pgm0807 {

	public static void main(String[] argv) throws IOException{
		Mathematics m = new Mathematics();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("½Ð¿é¤J n¡G");
		int n = java.lang.Integer.parseInt(br.readLine());

		System.out.println(m.sum(n));
	}
}
