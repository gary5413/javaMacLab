public class Ex_10_03 {
	
	public static void main(String[] argv) {
		String a = "�o�O�ܼ�a�����e";
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf('��'));
		System.out.println(a.indexOf("��",8));
		System.out.println(a.replace("�ܼ�","�`��"));
	}
}
		
