package javaFlag.javaFlagLab12.abstractLab1;

public class Circle extends Land{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return 2*3.14*r*r;
    }
}
