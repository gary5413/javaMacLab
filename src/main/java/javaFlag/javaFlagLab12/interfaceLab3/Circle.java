package javaFlag.javaFlagLab12.interfaceLab3;

public class Circle extends Shape implements  Surfacing{
    private double r;

    public Circle(double x, double y,double r) {
        super(x, y);
        this.r=r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
