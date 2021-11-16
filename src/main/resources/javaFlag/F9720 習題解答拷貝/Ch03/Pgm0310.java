public class Pgm0310 {
	public static void main(String[] argv) {
		final double rate = 0.0084; // 利率
		int principal = 24_0000;    // 本金 
		System.out.println("本金" + principal + "存1個月的本利和為" + 
                       principal*(1+rate/12) );
                       
    principal = 150_0000;       // 本金 
		System.out.println("本金" + principal + "存1個月的本利和為" + 
                       principal*(1+rate/12) );
	}
}