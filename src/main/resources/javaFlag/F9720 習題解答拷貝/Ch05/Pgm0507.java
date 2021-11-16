import java.io.*;

public class Pgm0507 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

		double discount = 1.0; // 折扣
    System.out.println("請輸入通話分鐘數：");
    System.out.print("→");

    String str = br.readLine();
    int minutes = Integer.parseInt(str);

		if(minutes >= 1500)
			discount = .79; // 79 折
		else if(minutes >= 800)
			discount = .9; // 9 折
		System.out.println(minutes + "分鐘的通話費用為：" + (minutes * 0.9 * discount));
	}
}