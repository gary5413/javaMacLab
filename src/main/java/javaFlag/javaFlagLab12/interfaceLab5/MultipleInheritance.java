package javaFlag.javaFlagLab12.interfaceLab5;

public class MultipleInheritance implements C{
    public void showI(){
        System.out.println(i);
    }

    @Override
    public void showJ() {
        System.out.println(j);
    }
    public void show(){
        showI();
        showJ();
    }
    public static void main(String[] argv){
        MultipleInheritance s = new MultipleInheritance();
        s.show();
    }
}
