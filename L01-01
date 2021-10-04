public class BubbleSort {

	/*
	 * This method sort the integer array using bubble sort algorithm
	 */
	public static void bubbleSort(int[] numbers) {
		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length -1; j > i; j--) {
				if (numbers[j] < numbers[j - 1]) {
					swapTwoNumbers(numbers, j, j-1);
				}
			}
		}
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numbers));
	}

	private static void swapTwoNumbers(int[] numbers, int from, int to) {
	 	int cache = numbers[from];
	 	numbers[from] = numbers[to];
	 	numbers[to] = cache;
	}
}