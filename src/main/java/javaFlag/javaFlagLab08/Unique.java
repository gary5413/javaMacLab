package javaFlag.javaFlagLab08;

class Test {
    int x = 3;

    void show() {
        System.out.println("x=" + x);
    }
}

public class Unique {
    public static  void main(String[] argv){
        Test a,b,c;

        a=new Test();
        b=new Test();
        System.out.println("a == b ?"+(a == b));

        c=b;
        c.x=10;
        System.out.println("c == b ?"+ (c == b));
        System.out.println("a.");
        a.show();
        System.out.println("b.");
        b.show();
        System.out.println("c.");
        c.show();

    }

}
