package linkedList;

/**
 * @author tinarambo
 *
 */
public class Node {

	/**
	 * Self-referential defined class: field of same type as it self.
	 * A reference is a number that refers to an object.
	 * Contains the object’s address in the computer’s memory
	 */
	public Node next;
	public int data;

	public Node() {
		this.next = null;
	}

	/**
	 * Creates a Node with data and next = null
	 * @param value
	 */
	public Node(int value) {
		this.data = value;
		this.next = null;
	}

	/**
	 * Creates a Node with data and pointer to next node
	 * @param value
	 * @param next
	 */
	public Node(int value, Node next) {
		this.data = value;
		this.next = next;
	}

	public void printNodeData() {
		System.out.print(" [ " + data + " ] ");
	}
}
