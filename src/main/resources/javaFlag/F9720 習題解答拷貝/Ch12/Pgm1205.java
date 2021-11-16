interface ICanCompare { 
	int compare(ICanCompare i); // �i����
}

class Search {
	public static int linearSearch(ICanCompare[] objs,ICanCompare target) {
		for(int i = 0;i < objs.length;i++) {
			if(objs[i].compare(target) == 0)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(ICanCompare[] objs,ICanCompare target) {
		int high = objs.length - 1; // �d��϶��k���m
		int low = 0; // �d��϶������m
		int middle = 0;

		while(low <= high) { // �٨S�䧹
			middle = (low + high) / 2; // ��X������

			if(target.compare(objs[middle]) == 0) { // ���F
				break;
			} else if (target.compare(objs[middle]) < 0) { // �b���b��
				high = middle - 1;
			} else { // �b�k�b��
				low = middle + 1;
			}
		}


		if(target.compare(objs[middle]) == 0) {
			return middle;
		} else {
			return -1;
		}
	}
}

class Personel implements ICanCompare {
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	
	String name; // �m�W
	int bornIn; // �X�ͦ~
	
	public String toString() {
		return name + "(" + bornIn + "�~��)";
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

public class Pgm1205 {
	
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"�^��"),
			new Teacher("Jean",62,"���")
		};
		
		for(Personel p : persons)
			System.out.println(p);
		
		int pos = Search.linearSearch(persons,persons[3]);
		System.out.println(persons[3] + "�O�� " + pos + "�����"); 
		pos = Search.binarySearch(persons,persons[2]);
		System.out.println(persons[2] + "�O�� " + pos + "�����"); 
	}
}