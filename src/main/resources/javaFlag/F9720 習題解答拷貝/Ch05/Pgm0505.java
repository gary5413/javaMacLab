import java.io.*;

public class Pgm0505 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));
    
    // 選擇運算
    System.out.println("請選擇(1)三角形(2)矩形(3)梯形");
    System.out.print("→");
 		String str = br.readLine();
    int choice = Integer.parseInt(str);
		
		int width; // 底長
		int height; // 高
		int width2; // 上底長度
    System.out.println("請輸入(下)底長");
    System.out.print("→");
 		str = br.readLine();
    width = Integer.parseInt(str);
    System.out.println("請輸入高");
    System.out.print("→");
 		str = br.readLine();
    height = Integer.parseInt(str);
		switch(choice) {
			case 1: // 三角形
				System.out.println("三角形面積為：" + (width * height / 2.0));
				break;
			case 2:
				System.out.println("矩形面積為：" + (width * height));
				break;
			case 3:
		    System.out.println("請輸入上底長");
		    System.out.print("→");
		 		str = br.readLine();
		    width2 = Integer.parseInt(str);
				System.out.println("梯形面積為：" + ((width + width2) * height / 2.0));
				break;
			default:
				System.out.println("選錯了");
		}
	}
}