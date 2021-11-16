public class Pgm0405 {
	public static void main(String[] argv) {
		double myspeed = 1; // 每秒幾公尺
		double friendspeed = 30 * 2.54 / 100; // 每秒幾公尺
		double distance =  200; // 兩人距離
		double time = distance / (myspeed +  friendspeed);
		
		System.out.println(time + "秒後相遇");
	}
}