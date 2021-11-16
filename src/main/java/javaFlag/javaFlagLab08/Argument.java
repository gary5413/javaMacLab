package javaFlag.javaFlagLab08;

public class Argument {
    public static void main(String[] argv){
        Argument a =new Argument();
        int i=20;
        System.out.println("before i="+i);
        a.changePara(i);
        System.out.println("after i="+i);
    }
    void changePara(int x){
        System.out.println("before x="+x);
        System.out.println("...");
        x++;
        System.out.println("after x="+x);
    }
}
