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

class PersonelManager {
	public static void showInfoByName(Personel... persons) {
		for(int i = 0;i < persons.length - 1;i++)
			for(int j = 0;j < persons.length - 1 - i;j++)
				if(persons[j].name.compareTo(persons[j + 1].name) > 0) {
					Personel temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
		for(Personel p : persons)
			System.out.println(p);
	}

	public static void showInfoByAge(Personel... persons) {
		for(int i = 0;i < persons.length - 1;i++)
			for(int j = 0;j < persons.length - 1 - i;j++)
				if(persons[j].bornIn < persons[j + 1].bornIn) {
					Personel temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
		for(Personel p : persons)
			System.out.println(p);
	}
}
		
public class Pgm1109 {
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"�^��"),
			new Teacher("Jean",62,"���")
		};
		
		PersonelManager.showInfoByAge(persons);
	}
}