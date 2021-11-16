package javaFlag.javaFlagLab09;

class Test4{
    int x=10,y=20;

    public Test4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Test4(int x) {
        this.x = x;
    }

    public Test4() {
    }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }

}
public class Overloading {
    public static void main(String[] argv){
        Test4 a = new Test4(30,40);
        Test4 b = new Test4(60);
        Test4 c = new Test4();

        a.show();
        b.show();
        c.show();
    }
}
