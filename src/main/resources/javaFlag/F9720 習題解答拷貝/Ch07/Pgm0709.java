public class Pgm0709 {

	public static void main(String[] argv) {
		int[][] hourFeeTable = {{0,2,4,6}, // �ɬq
														{30,50,80,100}}; // �ɬq�O�v
		int hours = 0; //�����ɼ�
		int fee = 0; //�����O��

		// �ഫ�� int
		hours = java.lang.Integer.parseInt(argv[0]);

		int i = hourFeeTable[0].length - 1;
		while(i > 0) {// ����X�̰��O�v�Ϭq
			if(hourFeeTable[0][i] < hours)
				break;
			i--;
		}

		while(i >= 0) { // �ѳ̰��O�v�Ϭq���U�֥[
			fee += (hours - hourFeeTable[0][i]) * hourFeeTable[1][i];
			hours = hourFeeTable[0][i];
			i--;
		}

		System.out.println("�����ɼơG" + argv[0] + "�p��");
		System.out.println("��ú�O�ΡG" + fee + "����");
	}
}
