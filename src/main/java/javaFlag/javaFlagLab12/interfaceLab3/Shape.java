package javaFlag.javaFlagLab12.interfaceLab3;

public class Shape {
    protected double x,y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
