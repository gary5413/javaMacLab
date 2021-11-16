import flag.utility.*;

abstract class Shape implements ICanCompare { // �����O
	abstract double area(); // �p�⭱�n
	public int compare(ICanCompare i) { // ��@compare
		Shape s = (Shape) i;
		return (int)(this.area() - s.area()); // �̾ڭ��n����j�p
	}
}

class Circle extends Shape { // ��Ϊ��g�a
	int r; // �b�|�]���G���ء^
	
	Circle(int  r) { // �غc��k
		this.r = r;
	}
	
	double area() { // �h���w�q������
		return 2 * 3.14 * r * r;
	}
	
	public String toString() {
		return "�b�|�G" + r + ",���n�G" + area() + "����";
	}
}

class Square extends Shape { // ����Ϊ��g�a
	int side; // ����]���G���ء^
	
	Square(int  side) { // �غc��k
		this.side = side;
	}
	
	double area() { // �h���w�q������
		return side * side;
	}
	
	public String toString() {
		return "����G" + side + ",���n�G" + area() + "�������";
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
		System.out.println("�Ƨǫ�..."); 
		
		for(Shape s : shapes) {
			System.out.println(s);
		}

	}
}