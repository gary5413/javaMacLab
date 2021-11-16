import java.util.Date;

public class Ex_15_7 extends Thread {
	Date d = new Date();
	
	public void run() {
		try {
			d.wait();
		} catch(InterruptedException e) {}
	}
}