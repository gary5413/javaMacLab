class Test {
	int x,y;
	
	// 預設的建構方法
	private Test(int x,int y) {
		this.x = x;
		this.y =y;
	}
}

public class Ex_09_04 {

	public static void main(String[] argv){
		Test a = new Test(3,4);
	}
}
