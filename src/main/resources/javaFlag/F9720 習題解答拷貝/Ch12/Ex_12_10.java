interface I1 {
	void show(String s);
}

interface I2 {
	String show(String s);
}

public class Ex_12_10 implements I1,I2 {
	public void show(String s) {
		System.out.println("�T�����G" + s);
	}

	public String show(String s) {
		System.out.println("�T�����G" + s);
		return s;
	}

	public static void main(String[] argv) {		
	}
}