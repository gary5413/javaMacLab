package javaFlag.javaFlagLab15;

import java.util.Date;

class TimerThread extends Thread{
    public void run(){
        while(true){
            for(int i=0;i<50_000_000;i++){
                Date now = new Date();
                System.out.println("new Thread"+now);
            }
        }
    }
}
public class TestThread {
    public static void main(String[] argv){
        TimerThread newThread = new TimerThread();
        newThread.start();
        while (true){
            for(int i=0;i<50_000_000;i++){
                Date now = new Date();
                System.out.println("old Thread"+now);
            }
        }
    }
}
