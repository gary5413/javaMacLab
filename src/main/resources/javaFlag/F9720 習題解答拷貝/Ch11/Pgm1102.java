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

class Calculator {
	double price; // 每平方公尺的價格（元）
	
	Calculator(double price) { // 建構方法
		this.price = price;
	}
	
	double calculatePrice(Land l) {
		return calculatePrice(price,l); 
	}

	double calculatePrice(double price,Land l) {
		return l.area() * price; // 透過多形叫用正確的area方法
	}
	
	double calculateAllPrices(Land... shapes) {
		// 使用多重定義的版本
		return calculateAllPrices(price,shapes);
	}

	double calculateAllPrices(double price,
		Land... lands) { // 多重定義的版本
		double total = 0; // 計算加總
		
		for(Land l : lands) { // 一一取出各個物件
			total += calculatePrice(price,l); // 個別計算並累加
		}
		
		return total;
	}
}

public class Pgm1102 {
	public static void main(String[] argv) {
		Circle c = new Circle(5); // 一塊圓形的地
		Square s = new Square(5); // 一塊正方形的地
		Rectangle r = new Rectangle(5,8); // 一塊矩形的地
		Triangle t = new Triangle(5,5); // 一塊三角形的地
		
		Calculator ca = new Calculator(3000.0); // 每平方公尺3000元
		
		System.out.println("三角形土地價值：" + // 叫用可指定地價的版本
			ca.calculatePrice(4000,t));
		System.out.println("全部土地總價值：" + // 使用匿名陣列
			ca.calculateAllPrices(4000,c,s,r,t)); 
	}
}