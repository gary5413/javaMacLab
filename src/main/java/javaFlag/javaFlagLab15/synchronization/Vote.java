package javaFlag.javaFlagLab15.synchronization;

public class Vote {
    private int total=0;
    private int numOfStations =2;
    private PollingStation[] stations;
    public void reportCount(String name,int count){
        int temp=total;
        System.out.println(name+","+count);
        temp=temp+count;
        System.out.println("all:"+temp);
        total=temp;
    }
    public void startReport(){
        stations = new PollingStation[numOfStations];
        for(int i =1;i<=numOfStations;i++){
            stations[i -1]=new PollingStation(this,i+"號");
        }
        for(int i=0;i<numOfStations;i++){
            stations[i].start();
        }
        for(int i=0;i<numOfStations;i++){
            try{
                stations[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("最後結果:");
        for(int i=0;i<numOfStations;i++){
            System.out.println(stations[i].name+":"+stations[i].total);
        }
        System.out.println("總票數:"+total);
    }
    public static void main(String[] argv){
        Vote vote = new Vote();
        vote.startReport();
    }
}
