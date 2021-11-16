package javaFlag.javaFlagLab11.polymorphism;

public class Square extends Land{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        return side *side;
    }
}
