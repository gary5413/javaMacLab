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

class Utility {
	public static Land max(Land... lands) { // �h���w�q������
		Land curr = lands[0];
		
		for(int i = 1;i < lands.length;i++) { // �@�@���X�U�Ӫ���
			if(curr.area() < lands[i].area())
				curr = lands[i];
		}
		
		return curr;
	}
}

public class Pgm1103 {
	public static void main(String[] argv) {
		Circle c = new Circle(5); // �@����Ϊ��a
		Square s = new Square(5); // �@������Ϊ��a
		Rectangle r = new Rectangle(5,8); // �@���x�Ϊ��a
		Triangle t = new Triangle(5,5); // �@���T���Ϊ��a
		
		System.out.println("���n�̤j�����G" + Utility.max(c,s,r,t).area());
	}
}