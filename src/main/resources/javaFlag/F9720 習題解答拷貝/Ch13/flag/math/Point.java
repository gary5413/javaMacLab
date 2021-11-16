package flag.math; // �N���O�]�˦b flag.math

public class Point {   // �N�I���O�ŧi�� public
  private double x,y;  

  public void setx(double x) {
    this.x = x;
  }

  public void sety(double y) {
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public Point(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    x = y = 0;
  }

  public Point(Point p) { // �νƻs�t�@���󪺫غc��k
    x = p.x;
    y = p.y;
  }
}