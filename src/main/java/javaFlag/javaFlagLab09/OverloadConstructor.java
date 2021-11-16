package javaFlag.javaFlagLab09;

class PointTest{
    int x,y;

    public PointTest(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle{
    PointTest upperleft;
    PointTest lowweright;

    public Rectangle(PointTest upperleft, PointTest lowweright) {
        this.upperleft = upperleft;
        this.lowweright = lowweright;
    }

    public Rectangle() {
        this(new PointTest(0,0),new PointTest(5,-5));
    }
    public Rectangle(int x1,int y1,int x2,int y2){
        this(new PointTest(x1,y1),new PointTest(x2,y2));
    }
    public Rectangle(PointTest upperleft,int length){
        this(upperleft,new PointTest(upperleft.x+length,upperleft.y-length));
    }
    public int area(){
        return (lowweright.x -upperleft.x)*(upperleft.y- lowweright.y);
    }
}
public class OverloadConstructor {
    public static void main(String[] argv){
        Rectangle a = new Rectangle(0, 0, 5, -5);
        Rectangle b = new Rectangle(new PointTest(3, 3), 4);
        System.out.println("a.area():"+a.area());
        System.out.println("b.area():"+b.area());
    }
}
