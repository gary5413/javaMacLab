import java.io.*;

public class Pgm1002 {
	
	// �p��q start ��m�}�l�Astr �r�ꤤ�s�򪺼Ʀr�Ӽ�
	static int countDigits(String str,int start) {
		char curr;
		int i;
		for(i = start;i < str.length();i++) {
			curr = str.charAt(i);
			if(curr < '0' || curr > '9')
				break;
		}
		return i - start;
	}

	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // �O���ϥΪ̿�J���
		boolean formatOK; // �ϥΪ̿�J���榡�O�_���T
		do {
			formatOK = false;
			System.out.print("�п�J�q�ܸ��X�G");
			str = br.readLine(); // Ū���ϥΪ̿�J���			
			
			if(str.charAt(0) == '(') {
				int digits = countDigits(str,1);
				if(digits >= 2 && digits <= 3) { // �ϰ츹�X��2���3��
					if(str.charAt(1 + digits) == ')') {
						if(str.charAt(2 + digits) == '-') {
							digits = countDigits(str,3 + digits);
							if(digits >= 7 && digits <= 8) // �q�ܸ��X��7���8��
								formatOK = true;
						}
					}
				}
			}
						
			if(!formatOK) { // �����T
				System.out.println(
					"�q�ܸ��X���ӬO(XX)-XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
