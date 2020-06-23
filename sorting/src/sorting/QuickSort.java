package sorting;

/**
 * @author tinarambo
 * Quick Sort is an "Divide and Conquer" algorithm. 
 * Divide and Conquer = breaking a big problem into smaller problems
 * and by solving the smaller problems and combining them to solve the big problem.
 * 
 *  1. Pick an element to be "pivot"
 *  2. Partition the array such as every element smaller than pivot is on the left side
 *     and every element larger on the right side
 *  3. Repeat step 1 and 2 recursively on both sides until every element is sorted 
 * 
 */
public class QuickSort {

	/*
	 *  0    1    2    3    4    5    6    7    8
	 *  44   75   23   43   55   12   64   77   33
	 *  
	 * */

	public void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int first, int last) {
		if (first < last) {
			int partitionInd = partition(array, first, last);
			quickSort(array, first, partitionInd - 1);
			quickSort(array, partitionInd + 1, last);
		}
	}

	/**
	 * @param array
	 * @param first
	 * @param last
	 * @return
	 */
	private int partition(int[] array, int first, int last) {
		int pivot = array[last];

		int l = first - 1;

		for (int r = first; r < last; r++) {
			if (array[r] < pivot) {
				l++;
				swap(array, l, r);
			}
		}
		swap(array, l + 1, last);

		return l + 1;
	}

	private void swap(int[] array, int l, int r) {
		int temp = array[l];
		array[l] = array[r];
		array[r] = temp;
	}

}
