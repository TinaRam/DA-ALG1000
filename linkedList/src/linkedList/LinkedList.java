package linkedList;

/**
 * @author tinarambo
 *
 */
public class LinkedList<D> {

	private Node<D> head;

	// Ha en tail som tar vare på siste node i listen?
	// private Node head,tail;

	public LinkedList() {
		head = null;
	}

	/**
	 * @return true if list is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * @return
	 */
	public int getLength() {
		return 0;
	}

	/**
	 * @param value
	 * @return
	 */
	public int countNodesWith(int value) {
		return 0;
	}

	/**
	 * 
	 */
	public void printList() {
	}

	/**
	 * 
	 */
	public void addLast() {
	}

	/**
	 * @param nextInt
	 */
	public void addAfter(int nextInt) {
	}

	/**
	 * @param nextInt
	 */
	public void addBefore(int nextInt) {
	}

	/**
	 * @param nextInt
	 */
	public void removeNode(int nextInt) {
	}

	/**
	 * 
	 */
	public void removeLast() {
	}

	/**
	 * 
	 */
	public void removeFirst() {
	}

	/**
	 * 
	 */
	public void deleteList() {
		int deletedNodes = getLength();
		// TODO: SLETT LISTE
		System.out.println("Sletting vellykket! " + deletedNodes + " elementer ble slettet.");
	}

}
