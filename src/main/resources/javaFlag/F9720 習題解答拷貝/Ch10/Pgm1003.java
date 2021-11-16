import java.io.*;

public class Pgm1003 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // �O���ϥΪ̿�J���
		boolean formatOK; // �ϥΪ̿�J���榡�O�_���T
		do {
			System.out.print("�п�J�q�ܸ��X�G");
			str = br.readLine(); // Ū���ϥΪ̿�J���
			
			formatOK = str.matches("\\(\\d{2,3}\\)-\\d{7,8}");
			if(!formatOK) { // �����T
				System.out.println(
					"�q�ܸ��X���ӬO(XX)-XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
