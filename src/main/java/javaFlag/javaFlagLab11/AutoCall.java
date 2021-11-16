package javaFlag.javaFlagLab11;

public class AutoCall {
    public static void main(String[] argv){
        Cylinder cr = new Cylinder();
        cr.setCenter(3,4);
        cr.setRadius(5);
        System.out.println(cr.toString());
    }
}
