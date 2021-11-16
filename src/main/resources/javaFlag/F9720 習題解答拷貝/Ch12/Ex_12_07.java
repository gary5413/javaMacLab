interface I1 {
	int i = 10;
	int add(int op);
}

public class Ex_12_07 implements I1 {
	public int add(int op) {
		I1.i += op;
		return I1.i;
	}

	public static void main(String[] argv) {		
	}
}