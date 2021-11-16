package javaFlag.javaFlagLab12.interfaceLab6;

interface P1{
    int i=20;
    void show();
}
interface P2{
    int j=30;
    void show();
}
interface C extends P1,P2{
    void show(String s);
}
public class NameConflict implements C{
    public void show(){
        show("");
    }

    @Override
    public void show(String s) {
        System.out.println(s+" "+i+" "+j);
    }
    public static void main(String[] argv){
        NameConflict s = new NameConflict();
        s.show();
    }
}
