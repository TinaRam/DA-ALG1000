package linkedList;

/**
 * @author tinarambo
 *
 */
public class Node {

	private int data;
	private Node next; // self-referential defined class: field of same type as it self
	// A reference is a number that refers to an object.
	// It’s the object’s address in the computer’s memory

	/**
	 * Creates a Node with data and next = null
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
