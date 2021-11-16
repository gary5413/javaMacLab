import java.io.*;

public class Pgm1004 {
	
	// �p��q start ��m�}�l�Astr �r�ꤤ�s�򪺼Ʀr�Ӽ�
	static int countLetters(String str,int start) {
		char curr;
		int i;
		for(i = start;i < str.length();i++) {
			curr = str.charAt(i);
			if(curr < 'a' || curr > 'z')
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
			System.out.print("�п�JE-MAIL�G");
			str = br.readLine(); // Ū���ϥΪ̿�J���			
			
			int letters = countLetters(str,0);
			int pos;
			int subdomains = 0;
			if(letters > 0) { //
				pos = letters;
				if(str.charAt(pos) == '@') {
					letters = countLetters(str,++pos);
					if(letters > 0) {
						pos += letters;
						while(pos < str.length()) {
							formatOK = false;
							if(str.charAt(pos) == '.') {
								letters = countLetters(str,++pos);
								if(letters > 0) {
									formatOK = true;
									pos += letters;
								}
								else
									break;
							}
							else
								break;
						}
					}
				}
			}
						
			if(!formatOK) { // �����T
				System.out.println(
					"�q�l�l�����ӬOXXX@XXXXXXXX");
			}
		} while (!formatOK);
	}
}
		
