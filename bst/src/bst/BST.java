package bst;

/**
 * @author tinarambo
 *
 * Binary Search Tree
 */
public class BST {

	protected Node root;
	protected int size;

	// Instansierer tre med rot-node med nøkkelverdien NULL, ingen barn
	public BST() {
		root = null;
	}

	// Instansierer tre med rot-node med nøkkelverdien [key], ingen barn
	public BST(int key) {
		root = new Node(key);
	}

	public boolean isEmpty() {
		return root == null ? true : false;
	}

	// 1: Les (inn?) tall (HELTALL) i et binært søketre
	// Enkelt tall
	public void insert(int key) {
		Node newNode = new Node(key); // oppretter node med verdien [key]

		if (isEmpty()) { // Hvis treet er tomt...
			root = newNode; // nyNode = rot
			size = 1;
		} else if (search(key)) {
			// node finnes fra før, ikke legg inn
		} else {

			Node curr = root;
			while (true) {
				if (key < curr.key) { // hvis verdi er mindre enn rot-verdi...
					if (curr.left == null) { // hvis venstre barn er tom...
						curr.left = newNode; // sett inn nyNode
						size++;
						break;
					}
					curr = curr.left; // gå til venstre barn

				} else { // hvis verdi er større enn rot-verdi...
					if (curr.right == null) { // hvis høyre barn er tom...
						curr.right = newNode; // sett inn nyNode
						size++;
						break;
					}
					curr = curr.right; // gå til høyre
				}
			}

		}

	}

	// 1: Les (inn?) tall (HELTALL) i et binært søketre
	// int[] treeData = new int[] {100, 10, 40, 110, 140, 35, 120, 5, 11, 37, 48, 105, 111, 130, 200};
	public void buildTree(int[] keys) {
		for (int i : keys) {
			insert(i);
		}
	}

	// 2: Finn det minste tallet i et binært søketre
	public int smallestKey() {
		Node curr = root;
		while (curr.left != null) {
			curr = curr.left;
		}
		return curr.key;
	}

	// 3: Finn det største tallet i et binært søketre
	public int largestKey() {
		Node curr = root;
		while (curr.right != null) {
			curr = curr.right;
		}
		return curr.key;
	}

	// 4: Sjekk om gitt tall er i et binært søketre
	public boolean search(int searchKey) {
		Node curr = root;
		while (curr != null) {
			if (searchKey == curr.key) {
				return true;
			}
			if (searchKey < curr.key) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return false;
	}

	public void printTree(String traverseType) {
		switch (traverseType) {
		case "pre":
			preOrder(root);
			break;
		case "in":
			inOrder(root);
			break;
		case "post":
			postOrder(root);
			break;
		default:
			break;
		}
	}

	// Tester ut recursive PRE-ORDER TRAVERSAL 
	// ( ROOT -> LEFT -> RIGHT )
	public void preOrder(Node n) {
		if (n != null) {
			System.out.print(n + "-");
			preOrder(n.left);
			preOrder(n.right);
		}
	}

	// Tester ut recursive INORDER TRAVERSAL 
	// ( LEFT -> ROOT -> RIGHT )
	public void inOrder(Node n) {
		if (n != null) {
			inOrder(n.left);
			System.out.print(n + " -");
			inOrder(n.right);
		}
	}

	// Tester ut recursive POST-ORDER TRAVERSAL 
	// ( LEFT -> RIGHT -> ROOT)
	public void postOrder(Node n) {
		if (n != null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n + " -");
		}
	}

}
