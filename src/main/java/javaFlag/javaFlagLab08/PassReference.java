package javaFlag.javaFlagLab08;

class TestA{
    int x=3;
    void show(){
        System.out.println("x="+x);
    }
}
class TestB{
    void changeTestA(TestA t,int newX){
        t.x=newX;
    }
}
public class PassReference {
    public static void main(String[] argv){
        TestA a = new TestA();
        TestB b = new TestB();
        a.show();
        b.changeTestA(a,20);
        a.show();

    }

}
