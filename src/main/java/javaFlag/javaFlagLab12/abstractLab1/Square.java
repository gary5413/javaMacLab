package javaFlag.javaFlagLab12.abstractLab1;

public class Square extends Land{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }
}
