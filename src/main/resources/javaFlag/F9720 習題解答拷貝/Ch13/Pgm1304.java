import java.io.*;
import flag.utility.CheckID;

public class Pgm1304 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		boolean isID = false;
		String str; // �O���ϥΪ̿�J���
		do {
			System.out.print("�п�J�����Ҧr���G");
			str = br.readLine(); // Ū���ϥΪ̿�J���
			switch(CheckID.isValidID(str)) {
				case CheckID.WRONG_FORMAT:
					System.out.println("�����Ҹ����ӬO�^��r���}�Y�A���9�ӼƦr�C");
					isID = false;
					break;
				case CheckID.INVALID_ID:
					System.out.println("�����Ҹ����~�C");
					isID = false;
					break;
				case CheckID.VALID_ID:
					System.out.println("�ˮֳq�L�C");
					isID = true;
					break;
			}
		} while (!isID);
	}
}