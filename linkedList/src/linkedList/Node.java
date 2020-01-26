package linkedList;

/**
 * @author tinarambo
 *
 * A generic Node class to make it reusable
 * @param <D> The Node's data
 */
public class Node<D> {

	private D data;
	private Node<D> next; // self-referential defined class: field of same type as it self
	// A reference is a number that refers to an object.
	// It’s the object’s address in the computer’s memory

	public Node() {
		this(null);
	}

	/**
	 * Creates a Node with data and next = null
	 * @param data
	 */
	public Node(D data) {
		this.data = data;
		this.next = null;
	}

	public Node(D data, Node<D> next) {
		this.data = data;
		this.next = next;
	}

	public void setNext(Node<D> next) {
		this.next = next;
	}

	public Node<D> getNext() {
		return this.next;
	}

	public D getData() {
		return this.data;
	}

	public void setData(D data) {
		this.data = data;
	}
}
