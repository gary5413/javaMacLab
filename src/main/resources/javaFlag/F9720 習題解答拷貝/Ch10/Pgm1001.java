import java.io.*;

public class Pgm1001 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str; // �O���ϥΪ̿�J���
		boolean isID; // �ϥΪ̿�J���榡�O�_���T
		do {
			isID = true;
			System.out.print("�п�J�����Ҧr���G");
			str = br.readLine(); // Ū���ϥΪ̿�J���			
			
			if(str.length() == 10) {
				char curr = str.toUpperCase().charAt(0);// ���Ĥ@�Ӧr��
				if(curr >= 'A' && curr <= 'Z') { // �Ĥ@�ӬO�r��
					for(int i = 1;i <= 9;i++) {
						curr = str.charAt(i); // �̧Ǩ��X�Ʀr
						if(curr < '0' || curr > '9') { // ���O�Ʀr
							isID = false;
							break;
						}
					}
				}
				else
					isID = false;
			}
			else
				isID = false;
						
			if(!isID) { // �����T
				System.out.println(
					"�����Ҧr�����ӬO1�ӭ^��r������9�ӼƦr�I");
			}
		} while (!isID);
	}
}
		
