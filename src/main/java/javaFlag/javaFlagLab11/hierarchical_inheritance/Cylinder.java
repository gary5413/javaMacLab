package javaFlag.javaFlagLab11.hierarchical_inheritance;

public class Cylinder extends Circle{
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }
}
