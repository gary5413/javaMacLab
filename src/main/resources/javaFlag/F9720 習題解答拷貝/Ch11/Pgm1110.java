class Personel {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // 姓名
	int bornIn; // 出生年
	
	public String toString() {
		return name + "(" + bornIn + "年次)";
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

class Comparator {
	// 傳回值
	// < 0,o1 < o2
	//   0,o1 == o2
	// > 0,01 > o2
	public int compare(Object o1,Object o2) {
		return 0;
	}
}

class CompareByName extends Comparator {
	public int compare(Object o1,Object o2) {
		Personel p1,p2;
		if(o1 instanceof Personel) {
			p1 = (Personel)o1;
			if(o2 instanceof Personel) {
				p2 = (Personel)o2;
				return p1.name.compareTo(p2.name);
			}
		}
		return 0;
	}
}

class CompareByAge extends Comparator {
	public int compare(Object o1,Object o2) {
		Personel p1,p2;
		if(o1 instanceof Personel) {
			p1 = (Personel)o1;
			if(o2 instanceof Personel) {
				p2 = (Personel)o2;
				return p2.bornIn - p1.bornIn;
			}
		}
		return 0;
	}
}
	
class PersonelManager {
	public static void showInfoAfterSorting(Comparator c,Personel... persons) {
		for(int i = 0;i < persons.length - 1;i++)
			for(int j = 0;j < persons.length - 1 - i;j++)
				if(c.compare(persons[j],persons[j + 1]) > 0) {
					Personel temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
		for(Personel p : persons)
			System.out.println(p);
	}

	public static void showInfoByName(Personel... persons) {
		showInfoAfterSorting(new CompareByName(),persons);
	}

	public static void showInfoByAge(Personel... persons) {
		showInfoAfterSorting(new CompareByAge(),persons);
	}
}

public class Pgm1110 {
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"英文"),
			new Teacher("Jean",62,"國文")
		};
		
		System.out.println("依年齡排序");
		PersonelManager.showInfoByAge(persons);
		System.out.println("依姓名排序");
		PersonelManager.showInfoByName(persons);
	}
}