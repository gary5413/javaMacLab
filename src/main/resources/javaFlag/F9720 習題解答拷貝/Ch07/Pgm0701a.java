public class Pgm0701a {
	public static void main(String[] argv) {
		int hours = 0;
		int fee = 0;

		// �ഫ�� int
		hours = java.lang.Integer.parseInt(argv[0]);

		if(hours > 7) { // ���p��W�L7�p�ɪ�����
			fee += (hours - 7) * 100;
			hours = 7;
		}

		if(hours > 3) { // �p��3~7�p�ɪ��ɬq
			fee += (hours - 3) * 60;
			hours = 3;
		}

		if(hours > 0) { // �p��3�p�ɤ����ɬq
			fee += (hours - 0) * 30;
			hours = 0;
		}

		System.out.println("�����ɼơG" + argv[0] + "�p��");
		System.out.println("��ú�O�ΡG" + fee + "����");
	}
}
