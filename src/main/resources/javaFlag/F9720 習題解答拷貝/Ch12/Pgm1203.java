interface ICanCompare { 
	int compare(ICanCompare i); // �i����
}

class Sort { // ���ѱƧǥ\�઺���O
	static void bubbleSort(ICanCompare[] objs) { // ��w�ƧǪk
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

	static void bubbleSortReverse(ICanCompare[] objs) { // ��w�ƧǪk
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

	private static void doQuickSort(ICanCompare[] objs,int start,int end) {		// �p�G�u���@�Ӥ����A������^
		if(start >= end) {
			return;
		}

		// ���o������������
		ICanCompare mid = objs[(start + end) / 2];

		int left = start;
		int right = end;
		while(left < right) { // �٥��۹J
			// �����ݷj�M
			while((left < end) && (objs[left].compare(mid) < 0)) {
				left++;
			}

			// ���e�ݷj�M
			while((right > start) && (objs[right].compare(mid) > 0)) {
				right--;
			}

			// �٥����
			if(left <= right) {
				ICanCompare temp = objs[left]; // �洫����
				objs[left] = objs[right];
				objs[right] = temp;
				left++; // �����ݲ���
				right--; // ���e�ݲ���
			}
		}

		// ���j�Ƨǫe���q
		doQuickSort(objs,start,right);
		doQuickSort(objs,left,end);
	}

	public static void quickSort(ICanCompare[] objs) {
		doQuickSort(objs,0,objs.length - 1); // �ƧǾ�Ӱ}�C
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

public class Pgm1203 {
	
	public static void main(String[] argv) {
		Personel[] persons = {
			new Student("John",88,"940001",1),
			new Student("Mary",87,"930001",2),
			new Teacher("Mike",60,"�^��"),
			new Teacher("Jean",62,"���")
		};
		
		for(Personel p : persons)
			System.out.println(p);
		
		Sort.quickSort(persons);
		System.out.println("�Ƨǫ�..."); 
		
		for(Personel p : persons)
			System.out.println(p);
	}
}