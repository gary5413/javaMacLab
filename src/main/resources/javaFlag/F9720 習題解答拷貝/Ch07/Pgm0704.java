public class Pgm0704 {
	public static void main(String[] argv) {
		int[] a = {30,20,10,5,34,44};

		System.out.println("��l�}�C���e�G");
		for(int i : a) 
			System.out.print(i + " ");

		int temp;
		for(int i = 0;i < a.length / 2;i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		
		System.out.println("\n���ध�᤺�e�G");
		for(int i : a) 
			System.out.print(i + " ");
	}
}
