import java.io.*;

public class Pgm0502 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J���Z�G");
    System.out.print("��");

    String str = br.readLine();
    int grade = Integer.parseInt(str);

		String level = "���~�����Z";
		if(grade < 60)
			level = "E";
		else if(grade < 70)
			level = "D";
		else if(grade < 80)
			level = "c";
		else if(grade < 90)
			level = "B";
		else if(grade <= 100)
			level = "A";
		
		System.out.println("�z�����Z���Ĭ��G" + level);
	}
}