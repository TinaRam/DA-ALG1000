package stack;

/**
 * @author tinarambo
 *
 */
public class Node {

	public Node next;
	public int data;

	public Node() {
		this.next = null;
	}

	public Node(int value) {
		this.data = value;
		this.next = null;
	}

	public Node(int value, Node next) {
		this.data = value;
		this.next = next;
	}

	public void printNodeData() {
		System.out.print(" [ " + data + " ] ");
	}
}
