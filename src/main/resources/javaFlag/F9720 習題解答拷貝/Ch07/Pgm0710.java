public class Pgm0710 {

	public static void main(String[] argv) {
		int[] data = new int[argv.length]; // �̾کR�O�C�ѼƭӼưt�m
		
		for(int i = 0;i < argv.length;i++)
			data[i] = Integer.parseInt(argv[i]); // �N�R�O�C�Ѽ��ഫ����Ʃ�J�}�C
			
		for(int i = 0;i < data.length;i++) {
			if(i == data[i])
				System.out.println("���޽X�G" + i + "�������Ȭ�"  + data[i]);
		}
	}
}
