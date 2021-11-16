package javaFlag.javaFlagLab12.interfaceLab4;

public class SimpleInheritance implements C{
    public void show(){
        System.out.println(i);
    }
    public int getI(){
        return i;
    }
    public static void main(String[] argv){
        SimpleInheritance s = new SimpleInheritance();
        s.show();
    }
}
