package linkedList;

/**
 * @author tinarambo
 *
 */
public class Node<D> {

	/**
	 * Self-referential defined class: field of same type as it self.
	 * A reference is a number that refers to an object.
	 * Contains the object’s address in the computer’s memory
	 */
	private Node<D> next;
	private D data;

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
