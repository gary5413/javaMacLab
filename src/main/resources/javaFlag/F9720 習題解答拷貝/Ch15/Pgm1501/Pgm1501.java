import java.io.*;

public class Pgm1501 implements TimeUp {
	static boolean noodleOK = false;
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("叫块獁难だ牧计");
    System.out.print("△");
    String str = br.readLine();
    int min = Integer.parseInt(str);

		Timer.setTimer(min * 1000 * 60,new Pgm1501());
		while(!noodleOK) {
			try {
				Thread.sleep(1000); // 难临⊿獁暗ㄆ
			}
			catch(InterruptedException e) {};
		}
	}
	
	public void notifyTimeUp() {
		System.out.println("难獁话е獁年奔");
		noodleOK = true;
	}
}