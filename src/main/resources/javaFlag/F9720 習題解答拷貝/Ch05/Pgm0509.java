import java.io.*;

public class Pgm0509 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("請輸入平均得分：");
    System.out.print("→");
    String str = br.readLine();
    int points = Integer.parseInt(str);
    System.out.println("請輸入籃板數：");
    System.out.print("→");
		str = br.readLine();
    int rebounds = Integer.parseInt(str);
    System.out.println("請輸入助攻數：");
    System.out.print("→");
		str = br.readLine();
    int assists = Integer.parseInt(str);
    System.out.println("請輸入抄截數：");
    System.out.print("→");
		str = br.readLine();
    int steals = Integer.parseInt(str);
    System.out.println("請輸入失誤數：");
    System.out.print("→");
		str = br.readLine();
    int turnovers = Integer.parseInt(str);

    // 計算MVP
    int mvp = (points + assists * 2 + rebounds * 2 + steals * 2 - turnovers * 2);
    if(mvp >= 45) 
    	System.out.println("A級球員");
    else if(mvp >= 35)
    	System.out.println("B級球員");
    else if(mvp > 25)
    	System.out.println("C級球員");
    else
    	System.out.println("萬年板凳球員");
	}
}