
public class Sorting {

	public static void main(String[] args) {
		int[] numbers = { 1, 29, 14, 15, 94 };
		int[] numbers1 = { 1, 29, 14, 15, 94 };

		SelectionSort(numbers);
		printArray(numbers);

		InsertionSort(numbers1);
		printArray(numbers1);
	}

	public static void SelectionSort(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[minIndex]) {
					minIndex = j;
				}
			}

			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}

	}

	public static void InsertionSort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			int key = num[i];
			int j = i - 1;

			while (j >= 0 && key < num[j]) {
				num[j + 1] = num[j];
				j--;
			}
			num[j + 1] = key;
		}

	}

	public static void printArray(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
