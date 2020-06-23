package sorting;

/**
 * @author tinarambo
 *
 * Heapsort is like an improved version of "Selection Sort" as it also divedes the input into
 * two subarrays, sorted and unsorted, but rather than searching through the unsorted part 
 * linearly it maintaines the unordered part in a heap structure. 
 * 
 * A Binary Heap is a tree with special properties were every parent node is bigger than or equal
 * to its kids = maxHeap (alternatively smaller than its kids = minHeap ) and is a complete tree
 * (complete tree = every level filled with nodes, except the lowest level (filled from left side))
 * 
 * Time complexity = O(n log n)
 * Space complexity = In-place
 * Stability = Unstable
 * Internal/external = Internal
 * Iterative or recursive = Iterative
 * Sort kind = Comparison sort
 * 
 */
public class HeapSort {

	protected void heapSortAsc(int[] arr) {

		// build MaxHeap
		buildMaxHeap(arr);
		//		System.out.print("BuildMaxHeap: ");
		//		printArray(arr);
		//		System.out.println();

		// Set boundary unsorted subarray
		int lastUnsorted = arr.length - 1;

		while (lastUnsorted > 0) {
			//SWAP root and lastUnsorted-element
			int temp = arr[0];
			arr[0] = arr[lastUnsorted];
			arr[lastUnsorted] = temp;

			heapifyMax(arr, 0, lastUnsorted);

			//System.out.println("Unsorted subarray boundary: " + lastUnsorted);
			//printArray(arr);

			lastUnsorted--;
		}

	}

	public void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print("" + i + ", ");
		}
		System.out.println();
	}

	/**
	 * @param arr = input to build MaxHeap of
	 */
	private void buildMaxHeap(int[] arr) {

		// Start in the middle index
		int index = arr.length / 2 - 1;

		while (index >= 0) {
			heapifyMax(arr, index, arr.length);
			index--;
		}

	}

	/**
	 * @param arr
	 * @param index
	 * @param length
	 */
	private void heapifyMax(int[] arr, int index, int maxIndex) {

		int leftChildIndex, rightChildIndex, parent;

		while (index < maxIndex) {
			parent = index;
			leftChildIndex = 2 * parent + 1;
			rightChildIndex = 2 * parent + 2;

			// If index has a leftChild AND leftChilds value is larger than index...
			if (leftChildIndex < maxIndex && arr[leftChildIndex] > arr[parent]) {
				//move index downwards (left) in the tree
				parent = leftChildIndex;
			}

			if (rightChildIndex < maxIndex && arr[rightChildIndex] > arr[parent]) {
				//move index downwards (right) in the tree
				parent = rightChildIndex;
			}

			if (parent != index) {
				// SWAP index with the largest
				int temp = arr[parent];
				arr[parent] = arr[index];
				arr[index] = temp;
				index = parent;
			} else {
				return;
			}

		}

	}

}
