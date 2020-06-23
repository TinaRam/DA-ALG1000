package sorting;

/**
 * @author tinarambo
 * Bubble Sort is a simple sorting algorithm that repeatedly iterates through the list,
 * comparing one element to the next and swap them if they are in the wrong order.
 * 
 * It is known as bubble sort, because with every complete iteration the largest element
 * in the given array, bubbles up towards the last place or the highest index,
 * just like a water bubble rises up to the water surface.
 * 
 * Bubble Sort has a worst case complexity of O(n^2) and is not recommended in praxis.
 */
public class BubbleSort {

	/**
	 * ITERATIVE BUBBLE SORT
	 * 
	 * @param arr = unsorted int array
	 * Arrays are reference types, and return is not necessary.
	 * 
	 * Bubble Sort simply starts with the first element and compare it to the second,
	 * and swap them if they are in wrong order. Then it compares the second to the third and so on.
	 */
	protected void bubbleSort(int[] arr) {

		// For each element in array...
		for (int iteration = 1; iteration < arr.length; iteration++) {

			// starting in posision 0, compare each posision with the next..
			for (int posision = 0; posision < arr.length - 1; posision++) {

				// and swap if bigger!
				if (arr[posision] > arr[posision + 1]) {
					int tmp = arr[posision];
					arr[posision] = arr[posision + 1];
					arr[posision + 1] = tmp;
				}
			}
		}
	}
}
