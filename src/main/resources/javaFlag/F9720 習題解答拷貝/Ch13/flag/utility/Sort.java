package flag.utility;

public class Sort { // ���ѱƧǥ\�઺���O
	public static void bubbleSort(ICanCompare[] objs) { 
		// ��w�ƧǪk
		for(int i = objs.length - 1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(objs[j].compare(objs[j + 1]) < 0) {
					ICanCompare temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
	}
	
	public static void quickSort(ICanCompare[] objs) {
		doQuickSort(objs,0,objs.length - 1);
	}
	
	private static void doQuickSort(ICanCompare[] objs,int start,int end) {
		// �p�G�u���@�Ӥ����A������^
		if(start >= end) {
			return;
		}

		// ���o������������
		ICanCompare mid = objs[(start + end) / 2];

		int left = start;
		int right = end;
		while(left < right) { // �٥��۹J
			// �����ݷj�M
			while((left < end) && (objs[left].compare(mid) < 0)) {
				left++;
			}

			// ���e�ݷj�M
			while((right > start) && (objs[right].compare(mid) > 0)) {
				right--;
			}

			// �٥����
			if(left <= right) {
				ICanCompare temp = objs[left]; // �洫����
				objs[left] = objs[right];
				objs[right] = temp;
				left++; // �����ݲ���
				right--; // ���e�ݲ���
			}
		}

		// ���j�Ƨǫe���q
		doQuickSort(objs,start,right);
		doQuickSort(objs,left,end);
	}
}