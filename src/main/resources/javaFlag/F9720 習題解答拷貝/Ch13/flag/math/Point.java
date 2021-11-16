package flag.math; // 將類別包裝在 flag.math

public class Point {   // 將點類別宣告為 public
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

  public Point(Point p) { // 用複製另一物件的建構方法
    x = p.x;
    y = p.y;
  }
}