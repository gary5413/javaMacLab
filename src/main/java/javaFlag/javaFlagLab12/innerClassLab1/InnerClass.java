package javaFlag.javaFlagLab12.innerClassLab1;

class Outter{
    private int i=1,j=2;
    static int k=3;
    class Inner{
        int j=4,k=5;
        void print(){
            System.out.print(i);
            System.out.print(Outter.this.j);
            System.out.print(Outter.k);
            System.out.println(j);
        }
    }
    void callInner(){
        Inner inner = new Inner();
        inner.print();
    }
}
public class InnerClass {
    public static void main(String[] argv){
        Outter outter = new Outter();
        outter.callInner();
        Outter.Inner o_inner = outter.new Inner();
        o_inner.print();
    }
}
