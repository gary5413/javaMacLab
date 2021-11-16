import java.io.*;

public class Pgm0508 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("請輸入身高：");
    System.out.print("→");
    String str = br.readLine();
    int height = Integer.parseInt(str);
    System.out.println("請輸入性別(1)男生(2)女生：");
    System.out.print("→");
		str = br.readLine();
    int sex = Integer.parseInt(str);
    
    // 計算體重
    if(sex == 1) // 男生
    	System.out.println(height + " 公分的男生理想體重為 " + (height - 80) * 0.7 + "公斤");
    else if(sex == 2)
    	System.out.println(height + " 公分的女生理想體重為 " + (height - 70) * 0.6 + "公斤");
    else
    	System.out.println("此種性別尚無公式可計算");
	}
}