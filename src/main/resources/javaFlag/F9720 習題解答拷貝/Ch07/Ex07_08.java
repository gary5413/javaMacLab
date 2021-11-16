public class Ex07_08 {
	public static void main(String[] argv) {
		int[] a = {5,6,7,8};
		int[] b = {1,2,3,4};
		int[] c;

		c = a;
		a = b;
		b = c;
		
		System.out.println("a[3]:" + a[3]);
		System.out.println("c[3]:" + c[3]);
	}
}
