class Test {
	public int x,y;
	public static final int w;
	
	public Test(int x,int y) {
		this.x = x;
		this.y = y;
	}

}

public class Ex_09_10 {

	public static void main(String[] argv){
		Test.w = 10;
		Test a = new Test(3,4);
	}
}
