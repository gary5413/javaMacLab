class Test {
	double callme(double d) {
		return d * d * d;
	}
	int callme(int i) {
		return i * i;
	}
}

public class Ex8_06 {
	public static void main(String[] argv) {
		Test t = new Test();
		System.out.println(t.callme(10));
	}
}