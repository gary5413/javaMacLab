package javaFlag.javaFlagLab12.interfaceLab7;

abstract class Land implements ICanCompare{
    abstract double area();
    public int compare(ICanCompare i){
        Land l=(Land)i;
        return (int)(this.area()-l.area());
    }
}

class Circle extends Land{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return 3.14*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}'+","+area();
    }
}
class Square extends Land{
    int side;

    public Square(int side) {
        this.side = side;
    }
    double area(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+","+area();
    }
}
