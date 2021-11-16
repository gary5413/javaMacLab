package flag.utility;

public class Sort { // 提供排序功能的類別
	public static void bubbleSort(ICanCompare[] objs) { 
		// 氣泡排序法
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
		// 如果只有一個元素，直接返回
		if(start >= end) {
			return;
		}

		// 取得中間元素的值
		ICanCompare mid = objs[(start + end) / 2];

		int left = start;
		int right = end;
		while(left < right) { // 還未相遇
			// 往尾端搜尋
			while((left < end) && (objs[left].compare(mid) < 0)) {
				left++;
			}

			// 往前端搜尋
			while((right > start) && (objs[right].compare(mid) > 0)) {
				right--;
			}

			// 還未交錯
			if(left <= right) {
				ICanCompare temp = objs[left]; // 交換元素
				objs[left] = objs[right];
				objs[right] = temp;
				left++; // 往尾端移動
				right--; // 往前端移動
			}
		}

		// 遞迴排序前後兩段
		doQuickSort(objs,start,right);
		doQuickSort(objs,left,end);
	}
}