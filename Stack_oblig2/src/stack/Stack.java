package stack;

/**
 * @author tinarambo
 *
 */
public class Stack {

	protected Node stackTop;

	public Stack() {
		stackTop = null;
	}

	// Setter inn node på toppen av stabelen
	public void push(int value) {
		Node newNode = new Node(value, stackTop); // ny node med verdien 'value' og next = stackTop
		stackTop = newNode;
	}

	// Sletter noden på toppen av stabelen
	public void pop() {
		// Sjekker om stabelen er tom
		if (stackTop == null) {
			System.out.println("Stabelen er tom...\n");
		} else {
			stackTop = stackTop.next; // Sletter topp-node
		}
	}

	public void printStack() {
		if (stackTop == null) {
			System.out.println("Stabelen er tom...\n");
		} else {
			Node current = stackTop;
			System.out.print("StackTop -> ");
			while (current != null) {
				current.printNodeData();
				System.out.println("");
				System.out.println("               |");

				current = current.next;
				System.out.print("            ");
			}
			System.out.println("  null\n");
		}
	}
}
