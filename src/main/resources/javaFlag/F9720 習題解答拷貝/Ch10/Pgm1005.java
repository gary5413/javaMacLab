import java.io.*;

public class Pgm1005 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // �O���ϥΪ̿�J���
		boolean formatOK; // �ϥΪ̿�J���榡�O�_���T
		do {
			formatOK = false;
			System.out.print("�п�JE-MAIL�G");
			str = br.readLine(); // Ū���ϥΪ̿�J���			
			
			formatOK = str.matches("[a-z]+@[a-z]+(\\.[a-z]+)+");
			if(!formatOK) { // �����T
				System.out.println(
					"�q�l�l�����ӬOXXX@XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
