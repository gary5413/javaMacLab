package javaFlag.javaFlagLab09;

class Test5{
    int x=10,y=20;
    Test5(int x,int y){
        this(x);  // 只能寫在第一行 呼叫另一個建構子 只能用this
        this.y=y;
    }

    public Test5(int x) {
        this.x = x;
    }
}
public class CallByThis {
    public static void main(String[] argv){
        Test5 a = new Test5(30, 50);
        System.out.println(a.x);
        System.out.println(a.y);

    }
}
