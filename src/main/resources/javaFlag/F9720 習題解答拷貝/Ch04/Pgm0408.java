public class Pgm0408 {
	public static void main(String[] argv) {
		int startH = 10; // �}�l���������I
		int startM = 23; // �}�l����������
		int endH = 15; // �������������I
		int endM = 20; // ��������������
		int total = (endH * 60 + endM) - (startH * 60 + startM); // �����`������
		
		// �U�ɬq������
		int over4 = total - 4 * 60;
		over4 = (over4 > 0) ? over4 : 0;
		int over2 = total - over4 - 2 * 60;
		over2 = (over2 > 0) ? over2 : 0;
		int under2 = total - over4 - over2;
		
		// �����O
		int fee = under2 / 30 * 30 + over2 / 30 * 40 + over4 / 30 * 60;
		
		System.out.println("�`�@�����O�G" + fee + " ��");
	}
}