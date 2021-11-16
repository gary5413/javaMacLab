class Personel {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // 姓名
	int bornIn; // 出生年
}

class Student extends Personel {
	public Student(String name,int bornIn,String id,int grade) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
	}
	
	String id; // 學號，六位數字
	int grade; // 年級，1~6
}

class Teacher extends Personel {
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	
	String course; // 教授科目，國文、英文、數學
}

public class Pgm1106 {
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("張三",88,"940001",1),
			new Student("王五",87,"930001",2),
			new Teacher("張九",60,"英文"),
			new Teacher("蕭十",62,"國文")
		};
	}
}