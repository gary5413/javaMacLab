package javaFlag.javaFlagLab09;

class Test8{
    public int x;
    public static int y;

    public Test8(int x,int y) {
        this.x = x;
        this.y=y;
    }
    public String toString(){
        return "(x,y):("+x+","+y+")";
    }
}
public class StaticMember {
    public static void main(String[] argv){
        Test8 a = new Test8(100,40);
        Test8 b = new Test8(200, 50);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
