class Test {
	int x,y;
	
	public Test(int x,int y) {
		this.x = x;
		this.y =y;
	}

	public Test() {
		Test(3,4)	;
	}
}

public class Ex_09_05 {

	public static void main(String[] argv){
		Test a = new Test();
	}
}
