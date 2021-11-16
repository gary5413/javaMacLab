class Land { // 父類別
	double area() { // 計算面積
		return 0;
	}
}

class Circle extends Land { // 圓形的土地
	int r; // 半徑（單位：公尺）
	
	Circle(int  r) { // 建構方法
		this.r = r;
	}
	
	double area() { // 多重定義的版本
		return 3.14 * r * r;
	}
}

class Square extends Land { // 正方形的土地
	int side; // 邊長（單位：公尺）
	
	Square(int  side) { // 建構方法
		this.side = side;
	}
	
	double area() { // 多重定義的版本
		return side * side;
	}
}

class Rectangle extends Land { // 代表矩形
	int width,height; // 寬與高（單位：公尺）
	
	Rectangle(int width,int height) { // 建構方法
		this.width = width;
		this.height = height;
	}
	
	double area() { // 多重定義的版本
		return width * height;
	}
}

class Triangle extends Land { // 代表三角形
	int width,height; // 底與高（單位：公尺）
	
	Triangle(int width,int height) { // 建構方法
		this.width = width;
		this.height = height;
	}
	
	double area() { // 多重定義的版本
		return width * height * 0.5;
	}
}

class Utility {
	public static Land max(Land... lands) { // 多重定義的版本
		Land curr = lands[0];
		
		for(int i = 1;i < lands.length;i++) { // 一一取出各個物件
			if(curr.area() < lands[i].area())
				curr = lands[i];
		}
		
		return curr;
	}
}

public class Pgm1103 {
	public static void main(String[] argv) {
		Circle c = new Circle(5); // 一塊圓形的地
		Square s = new Square(5); // 一塊正方形的地
		Rectangle r = new Rectangle(5,8); // 一塊矩形的地
		Triangle t = new Triangle(5,5); // 一塊三角形的地
		
		System.out.println("面積最大的為：" + Utility.max(c,s,r,t).area());
	}
}