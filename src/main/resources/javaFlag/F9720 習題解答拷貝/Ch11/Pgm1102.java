class Land { // �����O
	double area() { // �p�⭱�n
		return 0;
	}
}

class Circle extends Land { // ��Ϊ��g�a
	int r; // �b�|�]���G���ء^
	
	Circle(int  r) { // �غc��k
		this.r = r;
	}
	
	double area() { // �h���w�q������
		return 3.14 * r * r;
	}
}

class Square extends Land { // ����Ϊ��g�a
	int side; // ����]���G���ء^
	
	Square(int  side) { // �غc��k
		this.side = side;
	}
	
	double area() { // �h���w�q������
		return side * side;
	}
}

class Rectangle extends Land { // �N��x��
	int width,height; // �e�P���]���G���ء^
	
	Rectangle(int width,int height) { // �غc��k
		this.width = width;
		this.height = height;
	}
	
	double area() { // �h���w�q������
		return width * height;
	}
}

class Triangle extends Land { // �N��T����
	int width,height; // ���P���]���G���ء^
	
	Triangle(int width,int height) { // �غc��k
		this.width = width;
		this.height = height;
	}
	
	double area() { // �h���w�q������
		return width * height * 0.5;
	}
}

class Calculator {
	double price; // �C���褽�ت�����]���^
	
	Calculator(double price) { // �غc��k
		this.price = price;
	}
	
	double calculatePrice(Land l) {
		return calculatePrice(price,l); 
	}

	double calculatePrice(double price,Land l) {
		return l.area() * price; // �z�L�h�Υs�Υ��T��area��k
	}
	
	double calculateAllPrices(Land... shapes) {
		// �ϥΦh���w�q������
		return calculateAllPrices(price,shapes);
	}

	double calculateAllPrices(double price,
		Land... lands) { // �h���w�q������
		double total = 0; // �p��[�`
		
		for(Land l : lands) { // �@�@���X�U�Ӫ���
			total += calculatePrice(price,l); // �ӧO�p��ò֥[
		}
		
		return total;
	}
}

public class Pgm1102 {
	public static void main(String[] argv) {
		Circle c = new Circle(5); // �@����Ϊ��a
		Square s = new Square(5); // �@������Ϊ��a
		Rectangle r = new Rectangle(5,8); // �@���x�Ϊ��a
		Triangle t = new Triangle(5,5); // �@���T���Ϊ��a
		
		Calculator ca = new Calculator(3000.0); // �C���褽��3000��
		
		System.out.println("�T���Τg�a���ȡG" + // �s�Υi���w�a��������
			ca.calculatePrice(4000,t));
		System.out.println("�����g�a�`���ȡG" + // �ϥΰΦW�}�C
			ca.calculateAllPrices(4000,c,s,r,t)); 
	}
}