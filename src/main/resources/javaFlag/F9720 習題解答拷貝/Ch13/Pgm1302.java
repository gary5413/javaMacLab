import java.io.*;
import flag.utility.Searcher;

public class Pgm1302 {

	public static void main(String[] argv) throws IOException {
		Searcher a = new Searcher();

		System.out.print("�п�J�n�M�䪺���\n->");
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
    int target = java.lang.Integer.parseInt(br.readLine());

		int i = a.search(new int[] {3,5,7,8,10,34,56},target);
		if(i == -1) {
			System.out.println("�䤣�� " + target);
		}
		else {
			System.out.println("�b�� " + i + "�Ӥ������ " + target );
		}
	}
}
