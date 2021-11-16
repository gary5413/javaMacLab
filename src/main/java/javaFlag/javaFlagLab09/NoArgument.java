package javaFlag.javaFlagLab09;

class Test2{
    int x,y;
    Test2(){
        x=10;
        y=20;
    }
}
public class NoArgument {
    public static void main(String[] argv){
        Test2 a = new Test2();
        System.out.println("x:"+a.x);
        System.out.println("y:"+a.y);
    }
}
