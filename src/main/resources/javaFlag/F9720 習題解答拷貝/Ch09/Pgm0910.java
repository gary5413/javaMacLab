class Time {
	int hour,min,sec;
	public Time(int hour,int min,int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public int seconds(Time t) {
		int t1Seconds = (hour * 60 + min) * 60 + sec;
		int t2Seconds = (t.hour * 60 + t.min) * 60 + t.sec;
		return (t1Seconds > t2Seconds) ? (t1Seconds - t2Seconds) : (t2Seconds - t1Seconds);
	}
	
	public String toString() {
		return hour +"時" + min + "分" + sec + "秒";
	}
}

public class Pgm0910 {
	public static void main(String[] argv) {
		Time t1 = new Time(13,40,20);
		Time t2 = new Time(14,23,10);
		System.out.println(t1 + "與" + t2 + "差" + t1.seconds(t2) + "秒");
		System.out.println(t2 + "與" + t1 + "差" + t2.seconds(t1) + "秒");
	}
}