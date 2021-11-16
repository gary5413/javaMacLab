interface ICanCompare { 
	int compare(ICanCompare i); // 進行比較
}

class Search {
	public static int linearSearch(ICanCompare[] objs,ICanCompare target) {
		for(int i = 0;i < objs.length;i++) {
			if(objs[i].compare(target) == 0)
				return i;
		}
		return -1;
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

public class Pgm1204 {
	
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"英文"),
			new Teacher("Jean",62,"國文")
		};
		
		for(Personel p : persons)
			System.out.println(p);
		
		int pos = Search.linearSearch(persons,persons[3]);
		System.out.println(persons[3] + "是第 " + pos + "筆資料"); 
	}
}