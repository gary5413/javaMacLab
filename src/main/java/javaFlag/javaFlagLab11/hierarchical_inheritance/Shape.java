package javaFlag.javaFlagLab11.hierarchical_inheritance;

public class Shape {
    protected double x,y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "圓形原點:("+x+","+y+")";
    }
}
