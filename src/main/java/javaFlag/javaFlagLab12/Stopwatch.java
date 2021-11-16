package javaFlag.javaFlagLab12;

interface TimesUp{
    void notifyMe();
}
class Timer{
    static void startTimer(int seconds,TimesUp obj){

    for(int i=0;i<seconds;i++){

            obj.notifyMe();

        }
    }
}
class WatchUser implements TimesUp{
    @Override
    public void notifyMe() {
        System.out.println("time up");
    }
}
public class Stopwatch {
    public static void main(String[] argv){
        WatchUser watchUser = new WatchUser();
        Timer.startTimer(1000,watchUser);
    }
}
