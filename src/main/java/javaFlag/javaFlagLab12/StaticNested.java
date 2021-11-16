package javaFlag.javaFlagLab12;

class Outter{
    static class Inner{
        int i=1;
        static int j=2;
        static void add(int x){
            j +=x;
        }
        void print(){
            System.out.println(i+" "+j);
        }
    }
}
public class StaticNested {
    public static void main(String[] argv){
        Outter.Inner o_inner = new Outter.Inner();
        o_inner.i=3;
        Outter.Inner.j=4;
        Outter.Inner.add(5);
        o_inner.print();

    }
}
