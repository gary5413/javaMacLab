import java.io.*;

public class Pgm0509 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�����o���G");
    System.out.print("��");
    String str = br.readLine();
    int points = Integer.parseInt(str);
    System.out.println("�п�J�x�O�ơG");
    System.out.print("��");
		str = br.readLine();
    int rebounds = Integer.parseInt(str);
    System.out.println("�п�J�U��ơG");
    System.out.print("��");
		str = br.readLine();
    int assists = Integer.parseInt(str);
    System.out.println("�п�J�ۺI�ơG");
    System.out.print("��");
		str = br.readLine();
    int steals = Integer.parseInt(str);
    System.out.println("�п�J���~�ơG");
    System.out.print("��");
		str = br.readLine();
    int turnovers = Integer.parseInt(str);

    // �p��MVP
    int mvp = (points + assists * 2 + rebounds * 2 + steals * 2 - turnovers * 2);
    if(mvp >= 45) 
    	System.out.println("A�Ųy��");
    else if(mvp >= 35)
    	System.out.println("B�Ųy��");
    else if(mvp > 25)
    	System.out.println("C�Ųy��");
    else
    	System.out.println("�U�~�O���y��");
	}
}