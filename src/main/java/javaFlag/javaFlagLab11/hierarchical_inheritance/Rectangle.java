package javaFlag.javaFlagLab11.hierarchical_inheritance;

public class Rectangle extends Shape{
    private double w,h;

    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }
}
