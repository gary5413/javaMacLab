package javaFlag.javaFlagLab09;

class Circle{
    private Point p;
    private double r;

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }

    public Circle(double x,double y, double r) {
        p = new Point(x, y);
        this.r = r;
    }

    public Point getP() {
        return p;
    }

}
class Point{
    private double x,y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
public class SettingPrivateMember {
    public static void main(String[] argv){
        Circle c = new Circle(3, 4, 5);
        Point p = c.getP();
        p.setX(6);
        System.out.println(c.toString());
    }
}
