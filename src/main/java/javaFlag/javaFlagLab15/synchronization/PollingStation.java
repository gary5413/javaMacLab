package javaFlag.javaFlagLab15.synchronization;

public class PollingStation extends Thread{
    static int reportTimes=5;
    int total=0;
    Vote v;
    String name;
    public PollingStation(Vote v,String name){
        this.v=v;
        this.name=name;
    }
    public void run(){
        for(int i=0;i<reportTimes;i++){

            int count=(int)(Math.random()*500);
            v.reportCount(name,count);
            total+=count;

        }
    }
}
