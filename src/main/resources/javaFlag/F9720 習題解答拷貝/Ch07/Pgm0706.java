public class Pgm0706 {
	public static void main(String[] argv) {
		int[] a = {20,30,40,50};
		int[] b = {1,3,0,2};
		int[] temp = new int[a.length]; // �Ȧs��ƥΪ��}�C

		System.out.println("��l�}�C���e�G");
		for(int i : a) 
			System.out.print(i + " ");
		System.out.println("\n��m�}�C���e�G");
		for(int i : b) 
			System.out.print(i + " ");
		
		for(int i = 0;i < a.length;i++) // �ϥμȦs�}�C�մ����
			temp[b[i]] = a[i];

		for(int i = 0;i < a.length;i++) // �N��Ʃ�^��}�C
			a[i] = temp[i];

		System.out.println("\n�B�z��}�C���e�G");
		for(int i : a) 
			System.out.print(i + " ");
	}
}
