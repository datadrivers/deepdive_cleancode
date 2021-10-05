public class BubbleSorter {

	/*
	 * This method sort the integer array using bubble sort algorithm
	 */
	public static void bubbleSorter(int[] numArr) {
		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numArr));
		for (int i = 0; i < numArr.length; i++) {
			for (int j = numArr.length -1; j > i; j--) {
				if (numArr[j] < numArr[j - 1]) {
					exchange(numArr, j, j-1);
				}
			}
		}
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numArr));
	}

	/*
	 * Utility method to swap two numbers in array
	 *
	 * @param array
	 * @param a1
	 * @param a2
	 */
	private static void exchange(int[] array, int a1, int a2) {
	 	int a3 = array[a1];
	 	array[a1] = array[a2];
	 	array[a2] = a3;
	}
}