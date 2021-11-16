class Reverter {
	void doReverse(int[] data,int index) {
		if(index == 0)
			return;
		int temp = data[index - 1];
		doReverse(data,index - 1);
		data[data.length - index] = temp;
	}
	
	void reverse(int[] data) {
		doReverse(data,data.length);
	}
}

public class Pgm0810 {

	public static void main(String[] argv) {

		// argv�ǤJ�n���઺�}�C
		int[] data = new int[argv.length];

		// �N�ǤJ������ର���
		for(int i = 0;i < data.length;i++) {
			data[i] = java.lang.Integer.parseInt(argv[i]);
		}

		System.out.print("��l�}�C�G");
		for(int i : data)
			System.out.print(i + " ");
		// ����
		Reverter r = new Reverter();
		r.reverse(data);
		System.out.print("\n�����}�C�G");
		for(int i : data)
			System.out.print(i + " ");
	}
}
