import java.io.*;

public class Pgm0506 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

		int password = 7777; // �u�����K�X
    System.out.println("�п�J�K�X�]1000~9999�^�G");
    System.out.print("��");

    String str = br.readLine();
    int input = Integer.parseInt(str);

		if(password == input)
			System.out.println("�K�X���T");
		else
			System.out.println("�K�X���~");
	}
}