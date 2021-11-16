import java.util.Date;

public class Ex_15_10 extends Thread {
	Date d = new Date();
	
	public void run() {
		try {
			d.notify();
		} catch(InterruptedException e) {}
	}
}