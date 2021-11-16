package javaFlag.javaFlagLab12.interfaceLab2;

public class Circle extends Shape implements Surfacing{
    private double r;
    final static double PI=3.14159;
    public Circle(double x,double y,double r){
        super(x,y);
        this.r=r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }
    public String toString(){
        return "圓心:("+x+","+y+") 半徑："+r+" 面積："+area();
    }
}
