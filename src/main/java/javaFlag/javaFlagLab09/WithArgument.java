package javaFlag.javaFlagLab09;

class Test3{
    int x,y;

    public Test3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class WithArgument {
    public static void main(String[] argv){
        Test3 a = new Test3(30, 40);
        System.out.println(a.x);
        System.out.println(a.y);

    }
}
