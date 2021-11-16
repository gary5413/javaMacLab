interface ICanCompare { 
	int compare(ICanCompare i); // 進行比較
}

class Sort { // 提供排序功能的類別
	static void bubbleSort(ICanCompare[] objs) { // 氣泡排序法
		for(int i = objs.length - 1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(objs[j].compare(objs[j + 1]) < 0) {
					ICanCompare temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
	}

	static void bubbleSortReverse(ICanCompare[] objs) { // 氣泡排序法
		for(int i = objs.length - 1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(objs[j].compare(objs[j + 1]) > 0) {
					ICanCompare temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
	}

	private static void doQuickSort(ICanCompare[] objs,int start,int end) {		// 如果只有一個元素，直接返回
		if(start >= end) {
			return;
		}

		// 取得中間元素的值
		ICanCompare mid = objs[(start + end) / 2];

		int left = start;
		int right = end;
		while(left < right) { // 還未相遇
			// 往尾端搜尋
			while((left < end) && (objs[left].compare(mid) < 0)) {
				left++;
			}

			// 往前端搜尋
			while((right > start) && (objs[right].compare(mid) > 0)) {
				right--;
			}

			// 還未交錯
			if(left <= right) {
				ICanCompare temp = objs[left]; // 交換元素
				objs[left] = objs[right];
				objs[right] = temp;
				left++; // 往尾端移動
				right--; // 往前端移動
			}
		}

		// 遞迴排序前後兩段
		doQuickSort(objs,start,right);
		doQuickSort(objs,left,end);
	}

	public static void quickSort(ICanCompare[] objs) {
		doQuickSort(objs,0,objs.length - 1); // 排序整個陣列
	}
}

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
		return 3.14 * r * r;
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

public class Pgm1202 {
	
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