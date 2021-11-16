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
	
	// 完整版建構方法
	public Rectangle(Point upperleft,Point lowerright) {
		this.upperleft = upperleft;
		this.lowerright = lowerright;
	}
	
	// 不需參數的建構方法
	public Rectangle() {
		this(new Point(0,0),new Point(5,-5));
	}
	
	// 直接指定座標
	public Rectangle(int x1,int y1,int x2,int y2) {
		this(new Point(x1,y1),new Point(x2,y2));
	}
	
	// 正方形
	public Rectangle(Point upperleft,int length) {
		this(upperleft,new Point(upperleft.x + length,
			upperleft.y - length));
	}	
	
	// 計算面積
	public int area() {
		return (lowerright.x - upperleft.x) *
			(upperleft.y - lowerright.y);
	}
	
	public Rectangle overlap(Rectangle r) {
		// r1 表示自己,r2表示傳入的矩形
		int r1left = upperleft.x;
		int r1top = upperleft.y;
		int r1right = lowerright.x;
		int r1lower = lowerright.y;
		int r2left = r.upperleft.x;
		int r2top = r.upperleft.y;
		int r2right = r.lowerright.x;
		int r2lower = r.lowerright.y;
		
		int left,top,right,lower;
		if((r2left >= r1right) || (r2top <= r1lower)) // r2在r1右方或下方
			return null;
		if((r2right <= r1left) || (r2lower >= r1top)) // r2在r1左方或是上方
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
		
		System.out.println(a + "是正方形？" + a.isSquare());
		System.out.println(b + "是正方形？" + b.isSquare());
	}
}
