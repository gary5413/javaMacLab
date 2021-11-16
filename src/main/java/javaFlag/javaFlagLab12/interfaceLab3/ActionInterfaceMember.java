package javaFlag.javaFlagLab12.interfaceLab3;

public class ActionInterfaceMember {
    public static void main(String[] argv){
        Circle circle = new Circle(3, 4, 5);
        System.out.println(circle.toString());
        System.out.println(Surfacing.PI);
        System.out.println(circle.PI);
    }
}
