package javaFlag.javaFlagLab11.hierarchical_inheritance;

public class Hierainheri {
    public static void main(String[] argv){
        Rectangle re = new Rectangle(1, 2, 3, 4);
        Circle ci = new Circle(1, 2, 3);
        Cylinder cy = new Cylinder(1, 2, 3, 4);
        System.out.println(re.toString());
        System.out.println(ci.toString());
        System.out.println(cy.toString());
    }
}
