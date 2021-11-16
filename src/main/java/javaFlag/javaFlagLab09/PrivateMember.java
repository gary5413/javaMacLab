package javaFlag.javaFlagLab09;

class Test6{
    private int i=1;
    void modifyMember(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}
public class PrivateMember {
    public static void main(String[] argv){
        Test6 a = new Test6();

        a.show();
        a.modifyMember(20);
        a.show();
//        a.i=40;
    }
}
