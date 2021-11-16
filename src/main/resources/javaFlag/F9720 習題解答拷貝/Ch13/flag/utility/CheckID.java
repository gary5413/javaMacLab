package flag.utility;

public class CheckID {
	public static final int WRONG_FORMAT = -1;
	public static final int INVALID_ID = -2;
	public static final int VALID_ID = 0;

	// return 0 :	success
	//       -1 : format error
	//       -2 : invalid id
	public static int isValidID(String str) {
		
		if(!str.matches("[a-zA-Z]\\d{9}")) { // �����T
			return WRONG_FORMAT;
		}
		
		int[] letterNums = {10,11,12,13,14,15,16,
			17,34,18,19,20,21,22,
			35,23,24,25,26,27,28,
			29,32,30,31,33};
			
		str = str.toUpperCase(); // ���N�Ĥ@�ӭ^��r���ର�j�g
		char letter = str.charAt(0); // ���X�Ĥ@�Ӧr��
		// �N�Ĥ@�Ӧr���d�����N���Ʀr
		str = letterNums[letter - 'A'] + str.substring(1);
		
		int total = str.charAt(0) - '0'; // �}�l�[�`
		for(int i = 1;i < 10;i++) {
			total += (str.charAt(i) - '0') * (10 - i); // �̧ǥ[�`
		}
		
		// �H10��h�[�`�Ȥ��Ӧ�ƫ���Ӧ��
		int checkNum = (10 - total % 10) % 10;
		
		//�p�⵲�G�M�̫�@��Ƥ��
		if(checkNum == (str.charAt(10) - '0')) {
			return VALID_ID;
		} else {
			return INVALID_ID;
		}
	}
}