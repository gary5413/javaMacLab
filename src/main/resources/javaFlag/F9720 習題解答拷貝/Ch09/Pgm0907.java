class Point {
	public int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," +y + ")";
	}
}

class Rectangle {
	Point upperleft;
	Point lowerright;
	
	// ���㪩�غc��k
	public Rectangle(Point upperleft,Point lowerright) {
		this.upperleft = upperleft;
		this.lowerright = lowerright;
	}
	
	// ���ݰѼƪ��غc��k
	public Rectangle() {
		this(new Point(0,0),new Point(5,-5));
	}
	
	// �������w�y��
	public Rectangle(int x1,int y1,int x2,int y2) {
		this(new Point(x1,y1),new Point(x2,y2));
	}
	
	// �����
	public Rectangle(Point upperleft,int length) {
		this(upperleft,new Point(upperleft.x + length,
			upperleft.y - length));
	}	
	
	// �p�⭱�n
	public int area() {
		return (lowerright.x - upperleft.x) *
			(upperleft.y - lowerright.y);
	}
	
	public Rectangle overlap(Rectangle r) {
		// r1 ��ܦۤv,r2��ܶǤJ���x��
		int r1left = upperleft.x;
		int r1top = upperleft.y;
		int r1right = lowerright.x;
		int r1lower = lowerright.y;
		int r2left = r.upperleft.x;
		int r2top = r.upperleft.y;
		int r2right = r.lowerright.x;
		int r2lower = r.lowerright.y;
		
		int left,top,right,lower;
		if((r2left >= r1right) || (r2top <= r1lower)) // r2�br1�k��ΤU��
			return null;
		if((r2right <= r1left) || (r2lower >= r1top)) // r2�br1����άO�W��
			return null;
		left = (r2left > r1left) ? r2left : r1left;
		top = (r2top < r1top) ? r2top : r1top;
		right = (r2right < r1right) ? r2right : r1right;
		lower = (r2lower > r1lower) ? r2lower : r1lower;
		return new Rectangle(left,top,right,lower);	
	}
	
	public boolean isSquare() {
		return ((lowerright.x - upperleft.x) == (upperleft.y - lowerright.y));
	}
	
	public String toString() {
		return upperleft + "-" + lowerright;
	}
}

public class Pgm0907 {

	public static void main(String[] argv){
		Rectangle a = new Rectangle(0,0,5,-3);
		Rectangle b = new Rectangle(new Point(-1,1),6);
		
		System.out.println(a + "�O����ΡH" + a.isSquare());
		System.out.println(b + "�O����ΡH" + b.isSquare());
	}
}
