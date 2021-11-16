class Personel {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // �m�W
	int bornIn; // �X�ͦ~
	
	public String toString() {
		return name + "(" + bornIn + "�~��)";
	}
}

class Student extends Personel {
	public Student(String name,int bornIn,String id,int grade) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
	}
	
	String id; // �Ǹ��A����Ʀr
	int grade; // �~�šA1~6
	
	public String toString() {
		return super.toString() + "�G" + grade + "�~�žǥ� (�Ǹ��G" + id + ")";
	}
}

class Teacher extends Personel {
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	
	String course; // �б¬�ءA���B�^��B�ƾ�

	public String toString() {
		return super.toString() + "�G" + course + "�Ѯv";
	}
}

class Comparator {
	// �Ǧ^��
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
			new Teacher("Mike",60,"�^��"),
			new Teacher("Jean",62,"���")
		};
		
		System.out.println("�̦~�ֱƧ�");
		PersonelManager.showInfoByAge(persons);
		System.out.println("�̩m�W�Ƨ�");
		PersonelManager.showInfoByName(persons);
	}
}