import java.io.*;

public class Pgm1007 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs =  new String[10]; // 記錄使用者輸入資料
		for(int i = 0;i < 10;i++) {
			System.out.print("請輸入字串：");
			strs[i] = br.readLine(); // 讀取使用者輸入資料			
		}
		bubbleSort(strs);
		
		for(String str : strs)
			System.out.println(str);
	}
	
	static void bubbleSort(String[] strs) {
		for(int i = 0;i < strs.length - 1;i++) {
			for(int j = 0;j < strs.length - 1 - i;j++) {
				if(strs[j].compareTo(strs[j + 1]) > 0) {
					String temp = strs[j];
					strs[j] = strs[j + 1];
					strs[j + 1] = temp;
				}
			}
		}
	}
}
		
