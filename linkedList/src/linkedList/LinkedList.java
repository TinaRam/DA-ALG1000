package linkedList;

/**
 * @author tinarambo
 *
 */
public class LinkedList {

	public Node head;

	/**
	 * @return true if list is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * @return true if list contain value
	 */
	public boolean isValueInList(int value) {
		if (isEmpty()) {
			return false;
		}
		Node current = head;
		while (current != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void addToFront(int data) {
		Node newNode = new Node(); // Henter node fra systemet. Data og next = NULL
		newNode.data = data; // Fyller den med data
		newNode.next = head; // Justerer peker til å peke på den første noden i listen
		head = newNode; // Deklarerer ny node som head
	}

	// 1: Slett element først i listen
	public void removeFromFront() {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else {
			int deletedNode = head.data;
			head = head.next;
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.\n");
		}
	}

	// 2: Legg til element i slutten av listen
	public void addToBack(int data) {
		if (isEmpty()) {
			addToFront(data);
		} else {
			Node current = head; // Lager en node som peker på samme som head
			while (current.next != null) { // så lenge current ikke er siste elementet i listen
				current = current.next; // flytter oss til neste node i listen
			} // etter while vil current være det siste elementet i listen
			Node newNode = new Node(); // Henter node fra systemet
			newNode.data = data; // Fyller den med data (peker = null)
			current.next = newNode; // Justerer nåværende siste element i lista til å peke på ny node
		}
	}

	// 3: Slett et element i slutten av listen
	public void removeFromBack() {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else {
			Node current = head;
			Node prev = head;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			int deletedNode = current.data;
			if (prev == head) {
				head = head.next;
			} else {
				prev.next = null;
			}
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.\n");
		}
	}

	// 4: Slett et element med oppgitt verdi (sletter kun den første verdien den finner)
	public void removeNodeWithValue(int value) {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else if (!isValueInList(value)) {
			System.out.println("Det er ingen elementer i listen med verdien " + value + "\n");
		} else {
			Node current = head;
			Node prev = null;
			while (current != null) {
				if (current.data == value) {
					if (prev == null) { // hvis verdi er første node i listen
						head = head.next;
						return;
					} else if (current.next == null) { // hvis verdi er siste node i liste
						prev.next = null;
						return;
					} else {
						prev.next = current.next;
						return;
					}
				}
				prev = current;
				current = current.next;
			}
		}
	}

	// 5: Legg til et element etter et element med oppgitt verdi
	public void addAfterValue(int value, int data) {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else {
			Node current = head;
			while (current != null) {
				if (current.data == data) {
					Node newNode = new Node();
					newNode.data = value;
					newNode.next = current.next;
					current.next = newNode;
					return;
				}
				current = current.next;
			}
			System.out.println("Det finnes ingen elementer med verdien " + value + " i listen.\n");
		}
	}

	// 6: Legg til et element foran et element med oppgitt verdi
	public void addBeforeValue(int value, int data) {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else {
			Node current = head;
			Node prev = null;
			while (current != null) {
				if (current.data == value) {
					if (prev == null) { // om verdien er første element i lista
						addToFront(data);
						return;
					} else {
						Node newNode = new Node();
						newNode.data = data;
						prev.next = newNode;
						newNode.next = current;
					}
					return;
				}
				prev = current;
				current = current.next;
			}
		}
		System.out.println("Det finnes ingen elementer med verdien '" + value + "' i listen.\n");
	}

	// 7: Antall elementer i listen
	public int getListLength() {
		int length = 0;
		if (isEmpty()) {
			return length;
		} else {
			Node current = head;
			while (current != null) {
				current = current.next;
				length++;
			}
			return length;
		}
	}

	// 8: Skriv ut antall forekomster av elementer med oppgitt verdi
	public int countNodesWithValue(int value) {
		int c = 0;
		if (isEmpty()) {
			return c;
		} else {
			Node current = head;
			while (current != null) {
				if (current.data == value) {
					c++;
				}
				current = current.next;
			}
			return c;
		}
	}

	// 9: Skriv ut hele listen
	public void printList() {
		if (isEmpty()) {
			System.out.println("Det er ingen elementer i listen...\n");
		} else {
			System.out.print("head -->");
			Node current = head;
			while (current != null) {
				current.printValue();
				if (current.next != null) {
					System.out.print("-->");
				}
				current = current.next;
			}
			System.out.print("\n\n");
		}
	}

	// 10: Slett listen og vis antall slettede elementer
	public void deleteList() {
		int deletedNodes = getListLength();
		head = null;
		System.out.println("Sletting vellykket! " + deletedNodes + " elementer ble slettet.\n");
	}

}
