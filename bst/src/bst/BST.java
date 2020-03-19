package bst;

/**
 * @author tinarambo
 *
 * Binary Search Tree
 */
public class BST {

	protected Node root;
	protected int size;

	/**
	 * Instansierer binært søketre med rot = NULL, ingen barn
	 */
	public BST() {
		root = null;
	}

	/**
	 * @param key
	 * Instansierer binært søketre med bestemt rot-verdi [key], ingen barn
	 */
	public BST(int key) {
		root = new Node(key);
	}

	/**
	 * @return true || false etter om treet er tomt eller ikke
	 */
	public boolean isEmpty() {
		return root == null ? true : false;
	}

	/**
	 * @param key = verdien til ny node som skal settes inn i treet.
	 * 
	 * 1: Les inn tall (HELTALL) i et binært søketre
	 */
	public void insert(int key) {
		Node newNode = new Node(key); // oppretter node med verdien [key]

		if (isEmpty()) { // Hvis treet er tomt...
			root = newNode; // nyNode = rot
			size = 1;
		} else if (search(key)) {
			// node finnes fra før, ikke gjør noe
		} else {
			Node curr = root; //Lager dummy for å traversere treet
			while (true) {
				if (key < curr.key) { // hvis verdi er mindre enn rot-verdi...
					if (curr.left == null) { // hvis venstre barn er tom...
						curr.left = newNode; // nyNode blir venstre barn
						size++;
						break;
					}
					curr = curr.left; // gå til neste node til venstre

				} else { // hvis verdi er større enn rot-verdi...
					if (curr.right == null) { // hvis høyre barn er tom...
						curr.right = newNode; // nyNode blir høyre barn
						size++;
						break;
					}
					curr = curr.right; // gå til neste node til høyre
				}
			}

		}

	}

	/**
	 * @param keys = array med heltall
	 * 
	 * 1: Les inn et array med heltall i et binært søketre
	 * Tar et array med heltall og kaller på insert()-metoden for hvert tall i arrayet.
	 * 
	 * int[] treeData = new int[] {100, 10, 40, 110, 140, 35, 120, 5, 11, 37, 48, 105, 111, 130, 200};
	 */
	public void buildTree(int[] keys) {
		for (int i : keys) {
			insert(i);
		}
	}

	/**
	 * @return int minste tallet i BST
	 * 
	 * 2: Finn det minste tallet i et binært søketre
	 * 
	 * Den minste verdien i BST vil alltid ligge i bladnoden helt til venstre i treet,
	 * forutsatt at roten har en venstre bladnode da
	 * om ikke så vil roten i praksis fungere som en bladnode.
	 */
	public int smallestKey() {
		Node curr = root; // Dummy node for å traversere tre
		while (curr.left != null) { // Så lenge man ikke er på venstre bladnode...
			curr = curr.left;
		}
		return curr.key;
	}

	/**
	 * @return int største tallet i BST
	 * 
	 * 3: Finn det største tallet i et binært søketre
	 * 
	 * Den største verdien i BST vil alltid ligge i bladnoden i høyre subtre,
	 * forutsatt at roten har en høyre bladnode da
	 * om ikke så vil roten i praksis fungere som en bladnode.
	 */
	public int largestKey() {
		Node curr = root;
		while (curr.right != null) {
			curr = curr.right;
		}
		return curr.key;
	}

	/**
	 * @param searchKey = int søkeverdi
	 * @return true (verdi funnet) false (verdi ikke funnet)
	 * 
	 * 4: Sjekk om gitt tall er i et binært søketre
	 */
	public boolean search(int searchKey) {
		Node curr = root; // Dummy node traversering
		while (curr != null) { // Så lenge node ikke tom..
			if (searchKey == curr.key) { // sjekk om søkeverdi finnes i nåværende node
				return true; // returner funnet og avslutt søk
			}
			if (searchKey < curr.key) { // Om søkeverdi er mindre enn nåværende må den evt. være i venstre subtre
				curr = curr.left; // gå til venstre
			} else { // ellers må den evt. være i høyre subtre
				curr = curr.right;
			}
		}
		// END WHILE 

		return false; // returner søkeverdi ikke funnet
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
	/**
	 * 	 Recursive PRE-ORDER TRAVERSAL 
	 *   ( ROOT -> LEFT -> RIGHT )
	 * 
	 * @param n = tre-node av typen Node
	 * 
	 * Rekursive metode (kaller på seg selv)
	 * 
	 * Fungerer slik: 
	 * - Tar et Node-objekt som parameter og så lenge noden ikke er null;
	 * - printer nøkkelverdien til noden
	 * - kaller på seg selv med nodens venstre barn som parameter
	 *   som utfører metoden fra start med venstre barn. 
	 *   De resterende statements etter kallet på seg selv blir lagt på vent i en stack (stabel)
	 *   Når venstre barn ikke oppfyller if lenger, dvs. at noden er null, 
	 *   så utføres statements som ligger i toppen av stacken. Som her vil bety at den
	 * - kaller på nodens høyre barn 
	 * (siden statements er lagt i en stack, betyr det at det er venstre bladnodes høyre barn som blir testet først
	 *  deretter dens foreldres høyre barn osv.)
	 */
	public void preOrder(Node n) {
		if (n != null) {
			//System.out.print(n.key + ", ");
			System.out.print(n + ", ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}

	// Tester ut recursive INORDER TRAVERSAL 
	/**
	 *   Recursive INORDER TRAVERSAL 
	 *   ( LEFT -> ROOT -> RIGHT )
	 * 
	 * @param n
	 * Fungerer som "preOrder" bare i en annen rekkefølge
	 */
	public void inOrder(Node n) {
		if (n != null) {
			inOrder(n.left);
			System.out.print(n.key + ", ");
			inOrder(n.right);
		}
	}

	// Tester ut recursive POST-ORDER TRAVERSAL 
	/**
	 *   Recursive POST-ORDER TRAVERSAL 
	 *   ( LEFT -> RIGHT -> ROOT)
	 *   
	 * @param n
	 * 
	 * Fungerer som "preOrder" bare i en annen rekkefølge
	 */
	public void postOrder(Node n) {
		if (n != null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key + ", ");
		}
	}

}
