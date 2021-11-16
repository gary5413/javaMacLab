public class Ex_15_8 extends Thread {
	public static void main(String[] argv) {
		Ex_15_8 ex = new Ex_15_8();
		ex.start();
		ex.join();
	}
	
	public void run() {
		try {
			sleep(5000);
		}
		catch(InterruptedException e) {};
	}
}