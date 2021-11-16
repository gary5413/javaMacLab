package javaFlag.javaFlagLab15.runnable;
import java.util.Date;

class TimerThread implements Runnable{
    public void run(){
        while (true){
            for(int i=0;i<50_000_000;i++){
                Date now = new Date();
                System.out.println("new Thread"+now);
            }
        }
    }
}
public class TestRunnable {
    public static void main(String[] argv){
        Thread newThread = new Thread(new TimerThread());
        newThread.start();
        while (true){
            for(int i=0;i<50_000_000;i++){
                Date now = new Date();
                System.out.println("old Thread"+now);
            }
        }
    }
}
