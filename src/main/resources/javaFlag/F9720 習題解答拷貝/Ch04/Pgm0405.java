public class Pgm0405 {
	public static void main(String[] argv) {
		double myspeed = 1; // �C��X����
		double friendspeed = 30 * 2.54 / 100; // �C��X����
		double distance =  200; // ��H�Z��
		double time = distance / (myspeed +  friendspeed);
		
		System.out.println(time + "���۹J");
	}
}