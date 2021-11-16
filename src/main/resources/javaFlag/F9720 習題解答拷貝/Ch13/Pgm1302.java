import java.io.*;
import flag.utility.Searcher;

public class Pgm1302 {

	public static void main(String[] argv) throws IOException {
		Searcher a = new Searcher();

		System.out.print("請輸入要尋找的資料\n->");
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
    int target = java.lang.Integer.parseInt(br.readLine());

		int i = a.search(new int[] {3,5,7,8,10,34,56},target);
		if(i == -1) {
			System.out.println("找不到 " + target);
		}
		else {
			System.out.println("在第 " + i + "個元素找到 " + target );
		}
	}
}
