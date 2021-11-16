package javaFlag.javaFlagLab15.sleep;

import java.util.Date;

class TimerThread extends Thread {
    public void run() {
        try {
            while (true) {
                sleep(1000);
                Date now = new Date();
                System.out.println("new Thread" + now);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Sleep {
    public static void main(String[] argv){
        TimerThread newThread = new TimerThread();
        newThread.start();
        try{
            while (true){
                Thread.sleep(1000);
                Date now = new Date();
                System.out.println("old Thread"+now);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
