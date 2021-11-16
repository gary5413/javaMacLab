class Point {
	public int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

// �����
class Square {
	Point upperleft;
	int length;
	
	public Square(Point upperleft,int length) {
		this.upperleft = upperleft;
		this.length = length;
	}	
	
	// �p�⭱�n
	public int area() {
		return length * length;
	}
}

class Circle {
	Square s; // �]�t���ꪺ�̤p�����

	// �H��ߤΥb�|�غc��
	public Circle(Point center,int radius) {	
		Point topleft = new Point(center.x - radius,center.y + radius);
		this.s = new Square(topleft,2 * radius);
	}
	
	// �H�]�t�ꪺ�̤p����Ϋغc��
	public Circle(Square s) {
		this.s = s;
	}
	
	public double circumference() {
		return 3.14159 * (s.length); // ����Ϊ�����Y�����|
	}
	
	public double area() {
		return 3.14159 * s.area() / 4.0; // ����Ϊ����n��(2r)(2r)
	}
}

public class Pgm0905 {

	public static void main(String[] argv){
		Square r1 = new Square(new Point(0,0),10);
		Circle c1  = new Circle(r1);
		Circle c2 = new Circle(new Point(0,0),5);
		
		System.out.println("c1�����n�G" + c1.area());
		System.out.println("c1������G" + c1.circumference());
		System.out.println("c2�����n�G" + c2.area());
		System.out.println("c2������G" + c2.circumference());
	}
}
