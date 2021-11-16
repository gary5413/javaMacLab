class Point {
	public int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

// 正方形
class Square {
	Point upperleft;
	int length;
	
	public Square(Point upperleft,int length) {
		this.upperleft = upperleft;
		this.length = length;
	}	
	
	// 計算面積
	public int area() {
		return length * length;
	}
}

class Circle {
	Square s; // 包含此圓的最小正方形

	// 以圓心及半徑建構圓
	public Circle(Point center,int radius) {	
		Point topleft = new Point(center.x - radius,center.y + radius);
		this.s = new Square(topleft,2 * radius);
	}
	
	// 以包含圓的最小正方形建構圓
	public Circle(Square s) {
		this.s = s;
	}
	
	public double circumference() {
		return 3.14159 * (s.length); // 正方形的邊長即為直徑
	}
	
	public double area() {
		return 3.14159 * s.area() / 4.0; // 正方形的面積為(2r)(2r)
	}
}

public class Pgm0905 {

	public static void main(String[] argv){
		Square r1 = new Square(new Point(0,0),10);
		Circle c1  = new Circle(r1);
		Circle c2 = new Circle(new Point(0,0),5);
		
		System.out.println("c1的面積：" + c1.area());
		System.out.println("c1的邊長：" + c1.circumference());
		System.out.println("c2的面積：" + c2.area());
		System.out.println("c2的邊長：" + c2.circumference());
	}
}
