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

class Personel implements ICanCompare {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // 姓名
	int bornIn; // 出生年
	
	public String toString() {
		return name + "(" + bornIn + "年次)";
	}
	
	public int compare(ICanCompare i) {
		Personel p = (Personel)i;
		return (name.compareTo(p.name));
	}
}

class Student extends Personel {
	public Student(String name,int bornIn,String id,int grade) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
	}
	
	String id; // 學號，六位數字
	int grade; // 年級，1~6
	
	public String toString() {
		return super.toString() + "：" + grade + "年級學生 (學號：" + id + ")";
	}
}

class Teacher extends Personel {
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	
	String course; // 教授科目，國文、英文、數學

	public String toString() {
		return super.toString() + "：" + course + "老師";
	}
}

public class Pgm1203 {
	
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"英文"),
			new Teacher("Jean",62,"國文")
		};
		
		for(Personel p : persons)
			System.out.println(p);
		
		Sort.quickSort(persons);
		System.out.println("排序後..."); 
		
		for(Personel p : persons)
			System.out.println(p);
	}
}