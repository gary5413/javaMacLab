public class Pgm0701b {

	public static void main(String[] argv) {
		int[] hourTable = {0,3,7,}; // �ɬq
		int[] feeTable = {30,60,100}; // �ɬq�O�v
		int hours = 0; //�����ɼ�
		int fee = 0; //�����O��

		// �ഫ�� int
		hours = java.lang.Integer.parseInt(argv[0]);

		int i = hourTable.length - 1;
		while(i > 0) {// ����X�̰��O�v�Ϭq
			if(hourTable[i] < hours)
				break;
			i--;
		}

		while(i >= 0) { // �ѳ̰��O�v�Ϭq���U�֥[
			fee += (hours - hourTable[i]) * feeTable[i];
			hours = hourTable[i];
			i--;
		}

		System.out.println("�����ɼơG" + argv[0] + "�p��");
		System.out.println("��ú�O�ΡG" + fee + "����");
	}
}
