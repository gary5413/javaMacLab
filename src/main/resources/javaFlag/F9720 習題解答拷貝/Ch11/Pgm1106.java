class Personel {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // �m�W
	int bornIn; // �X�ͦ~
}

class Student extends Personel {
	public Student(String name,int bornIn,String id,int grade) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
	}
	
	String id; // �Ǹ��A����Ʀr
	int grade; // �~�šA1~6
}

class Teacher extends Personel {
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	
	String course; // �б¬�ءA���B�^��B�ƾ�
}

public class Pgm1106 {
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("�i�T",88,"940001",1),
			new Student("����",87,"930001",2),
			new Teacher("�i�E",60,"�^��"),
			new Teacher("���Q",62,"���")
		};
	}
}