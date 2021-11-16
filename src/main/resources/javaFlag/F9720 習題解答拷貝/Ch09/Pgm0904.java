class Complex {
	double real; // 實部
	double imaginal; // 虛部
	
	public Complex(double real,double imaginal) {
		this.real = real;
		this.imaginal = imaginal;
	}
	
	public Complex(Complex c) {
		this.real = c.real;
		this.imaginal = c.imaginal;
	}
	
	public Complex add(Complex c) { // 加法
		return new Complex(real + c.real,imaginal + c.imaginal);
	}

	public Complex minus(Complex c) { // 減法
		return new Complex(real - c.real,imaginal - c.imaginal);
	}
	
	public String toString() {
		return "("+ real + " + " + imaginal + "i)";
	}
}

public class Pgm0904 {
	public static void main(String[] argv) {
		Complex c1 = new Complex(4,5);
		Complex c2 = new Complex(c1);
		Complex c3 = c1.add(c2);
		System.out.println(c1 + " + " + c2 + " = " + c3);
		System.out.println(c3 + " - " + c2 + " = " + c3.minus(c2));
	}
}