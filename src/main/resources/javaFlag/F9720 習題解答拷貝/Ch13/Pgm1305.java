import flag.utility.*;

abstract class Shape implements ICanCompare { // 父類別
	abstract double area(); // 計算面積
	public int compare(ICanCompare i) { // 實作compare
		Shape s = (Shape) i;
		return (int)(this.area() - s.area()); // 依據面積比較大小
	}
}

class Circle extends Shape { // 圓形的土地
	int r; // 半徑（單位：公尺）
	
	Circle(int  r) { // 建構方法
		this.r = r;
	}
	
	double area() { // 多重定義的版本
		return 2 * 3.14 * r * r;
	}
	
	public String toString() {
		return "半徑：" + r + ",面積：" + area() + "的圓";
	}
}

class Square extends Shape { // 正方形的土地
	int side; // 邊長（單位：公尺）
	
	Square(int  side) { // 建構方法
		this.side = side;
	}
	
	double area() { // 多重定義的版本
		return side * side;
	}
	
	public String toString() {
		return "邊長：" + side + ",面積：" + area() + "的正方形";
	}
}

public class Pgm1305 {
	
	public static void main(String[] argv) {
		Shape[] shapes = {
			new Circle(5),
			new Square(3),
			new Square(2),
			new Circle(5)
		};
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
		
		Sort.quickSort(shapes);
		System.out.println("排序後..."); 
		
		for(Shape s : shapes) {
			System.out.println(s);
		}

	}
}