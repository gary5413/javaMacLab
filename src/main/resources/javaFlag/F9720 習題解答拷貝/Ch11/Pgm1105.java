class Utility {
	public static int[] sort(int... numbers) {
		for(int i = 0;i < numbers.length - 1;i++)
			for(int j = 0;j < numbers.length - 1 - i;j++)
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
				
		return numbers;
	}
}

public class Pgm1105 {
	public static void main(String[] argv) {
		int[] numbers = Utility.sort(4,6,3,7,9,10,34,22);
		for(int i : numbers)
			System.out.println(i);
	}
}