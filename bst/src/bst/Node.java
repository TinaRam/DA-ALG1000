package bst;

/**
 * @author tinarambo
 *
 */
public class Node {

	protected int key;
	protected Node left;
	protected Node right;

	public Node(int data) {
		key = data;
		left = right = null;
	}

	public Node(int data, Node leftChild, Node rightChild) {
		key = data;
		left = leftChild;
		right = rightChild;
	}

	public String toString() {
		return "[ " + key + " ]";
	}
}
