public class Pgm0310 {
	public static void main(String[] argv) {
		final double rate = 0.0084; // �Q�v
		int principal = 24_0000;    // ���� 
		System.out.println("����" + principal + "�s1�Ӥ몺���Q�M��" + 
                       principal*(1+rate/12) );
                       
    principal = 150_0000;       // ���� 
		System.out.println("����" + principal + "�s1�Ӥ몺���Q�M��" + 
                       principal*(1+rate/12) );
	}
}