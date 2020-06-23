package sorting;

/**
 * @author tinarambo
 *
 * Insertion Sort simple sorting algorithm O(n^2) (good if its less than 50 elements, else NOT)
 * 
 * Works similarly to "Selection Sort" by dividing the array into two subarrays;
 * one sorted and one unsorted.
 * 
 */
public class InsertionSort {

	/**
	 * @param arr = unsorted int array
	 * Method for sorting an int array ascendingly
	 */
	protected void insertionSort(int[] arr) {

		// For each element (posision) in the array...
		for (int pos = 0; pos < arr.length; pos++) {

			int posValue = arr[pos]; // holds posision's value

			int index = pos - 1; // holds index before posision 

			// index >= 0 --> wont run if index is -1 (for the first posision)
			// arr[index] > posValue --> Value in 'index's posision is higher than posision we compair to
			while (index >= 0 && arr[index] > posValue) {

				// move higher value in front of lower...
				int temp = arr[index];
				arr[index] = posValue;
				arr[index + 1] = temp;

				// reduce index by one to check against previous posisions
				index--;
			}

		}

	}

}
