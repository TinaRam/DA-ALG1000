package sorting;

import java.util.Random;

/**
 * @author tinarambo
 *
 */
public class TestSorting {

	private static Random random = new Random();
	private static long start, end;

	/**
	 * @param arr = int array to search in
	 * @param key = value to search for
	 * Loops trough array backwards looking for [key].
	 * Prints out match(es) index(es)
	 */
	public static void searchIteratingBackwards(int[] arr, int key) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key) {
				System.out.println(key + " found in index: " + i);
			}
		}
	}

	public static int[] createTestData(int arraySize) {
		int[] arr = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10000);
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("" + i + ", ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//		InsertionSort i = new InsertionSort();
		//		SelectionSort s = new SelectionSort();
		//		BubbleSort b = new BubbleSort();
		HeapSort h = new HeapSort();
		//QuickSort q = new QuickSort();
		//int[] t = createTestData(10);
		//int[] t = { 82, 90, 10, 12, 15, 77, 55, 23 };
		int[] t = { 44, 75, 23, 43, 55, 12, 64, 77, 33 };
		System.out.println("Unsorted array: ");
		printArray(t);
		System.out.println();
		start = System.currentTimeMillis();
		//i.insertionSort(t);
		//s.selectionSort(t);
		//b.bubbleSort(t);
		h.heapSortAsc(t);
		//q.quickSort(t);
		end = System.currentTimeMillis();

		System.out.println("\nSort with " + t.length + " elements sorted in " + (end - start) + " ms");
		printArray(t);
	}

}
