import flag.math.Point; // �פJ�M�󤤪����O

class Circle {       // ��
  private Point p;   // ���
  private double r;  // �b�|

  public Point getp() {
    return new Point(p);
  }

  Circle(double x,double y,double r) {
    p = new Point(x,y);
    this.r = r;
  }

  Circle() {
    this(0,0,1);
  }

  public String toString() {
    return "��ߡG" + p.toString() + " �b�|�G" + r;
  }
}

public class Pgm1301 {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);

    Point p = c.getp(); // ���o�N���ߪ��I����
    p.setx(6);          // �ܧ��ߪ� x �y��
    System.out.println(c.toString());
  }
}
