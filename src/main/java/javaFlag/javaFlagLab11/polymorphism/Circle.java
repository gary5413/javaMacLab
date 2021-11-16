package javaFlag.javaFlagLab11.polymorphism;

public class Circle extends Land{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return 3.14 * r *r;
    }
}
