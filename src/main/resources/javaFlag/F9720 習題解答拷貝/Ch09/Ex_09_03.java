class Test {
	int x,y;
	
	// 預設的建構方法
	Test(int x,int y) {
		this.x = x;
		this.y =y;
	}
}

public class Ex_09_03 {

	public static void main(String[] argv){
		Test a = new Test();
		a.Test(3,4);
	}
}
