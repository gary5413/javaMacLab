import java.io.*;

public class Pgm0510 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�u�ɡG");
    System.out.print("��");
    String str = br.readLine();
    int hours = Integer.parseInt(str);
    System.out.println("�п�J���~�G");
    System.out.print("��");
		str = br.readLine();
    int pay = Integer.parseInt(str);

		double salary = 0;
		if(hours > 120) {
			salary += (hours - 120) * pay * 1.66;
			hours = 120;
		}
		if(hours > 60) {
			salary += (hours - 60) * pay * 1.33;
			hours = 60;
		}
		salary += hours * pay;
		
		System.out.println("�z���~�����G" + salary);
	}
}