import java.io.*;

public class Pgm1501 implements TimeUp {
	static boolean noodleOK = false;
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("�п�J�w�Ѥ����ơG");
    System.out.print("��");
    String str = br.readLine();
    int min = Integer.parseInt(str);

		Timer.setTimer(min * 1000 * 60,new Pgm1501());
		while(!noodleOK) {
			try {
				Thread.sleep(1000); // ���٨S�w�n�A�i�H���O����
			}
			catch(InterruptedException e) {};
		}
	}
	
	public void notifyTimeUp() {
		System.out.println("�Ѫw�n�F�A���֦Y�A�O�w�걼�I");
		noodleOK = true;
	}
}