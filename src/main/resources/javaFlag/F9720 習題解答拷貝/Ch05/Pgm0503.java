import java.io.*;

public class Pgm0503 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J���Z�G");
    System.out.print("��");

    String str = br.readLine();
    int grade = Integer.parseInt(str);

		String level;
		switch(grade / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:				
				level = "E";
				break;
			case 6:
				level = "D";
				break;
			case 7:
				level = "c";
				break;
			case 8:
				level = "B";
				break;
			case 9:
			case 10:
				level = "A";
				break;
			default:
				level = "���~�����Z";
		}
		System.out.println("�z�����Z���Ĭ��G" + level);
	}
}