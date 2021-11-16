package javaFlag.javaFlagLab11.hierarchical_inheritance;

public class Circle extends Shape{
    private double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }
}
