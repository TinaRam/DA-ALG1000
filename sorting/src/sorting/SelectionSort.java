package sorting;

/**
 * @author tinarambo
 * 
 *  Selection Sort is an easy, but ineffecient, in-place sorting algorithm O(n^2)
 *  
 *  It divides the array into two subarrays;
 *  - one sorted (left side) and - one unsorted(right side)
 *  At the beginning all elements are on the unsorted side. Then, one by one,
 *  it picks the smallest value in the unsorted subarray and place it in the sorted side.
 *  
 */
public class SelectionSort {

	/**
	 * @param arr = unsorted int array
	 * Method for sorting int arrays ascendingly by dividing the array into subarrays.
	 * The first loop starts at posision 0 and compare it to each of the elements on the unsorted side (second loop)
	*  and swap them if they are lower. In the next iteration position 1 is compared with
	*  all unsorted, moving the sorted subarray boundary to the right untill all elements
	*  are in the sorted subarray.
	 */
	protected void selectionSort(int[] arr) {

		// First FOR-loop moves boundary to the right starting at posision 0
		for (int pos = 0; pos < arr.length - 1; pos++) {

			int posMin = pos; // store the index of the posision were compairing to

			// Second FOR-loop compares [posision] to each element in unsorted subarray
			// starting with first posision after boundary
			for (int i = pos + 1; i < arr.length; i++) {

				if (arr[i] < arr[posMin]) { // if value in unsorted subarray is smaller...
					posMin = i; // store index of smallest value
				}

			} // iterated entire unsorted subarrayet. posMin have the index with the lowest value

			// Swap the minimum value found in unsorted with boundary posision 
			int minValue = arr[posMin]; // hold lowest value while swapping
			arr[posMin] = arr[pos]; // replace lowest value with pos' value
			arr[pos] = minValue; // add lowest value to pos
		}
	}

}
