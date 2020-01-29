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

	public void addFirst(int data) {
		Node newNode = new Node(); // Henter node fra systemet. Data og next = NULL
		newNode.data = data; // Fyller den med data
		newNode.next = head; // Justerer peker til å peke på den første noden i listen
		head = newNode; // Deklarerer ny node som head
	}

	// 1: Slett element først i listen
	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("Listen er allerede tom.\n");
		} else {
			int temp = head.data;
			head = head.next;
			System.out.println("Sletting vellykket! Node [ " + temp + " ] er nå slettet.\n");
		}
	}

	// 2: Legg til element i slutten av listen
	public void addLast(int data) {
		if (isEmpty()) {
			addFirst(data);
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
	public void removeLast() {

	}

	// 4: Slett et element med oppgitt verdi
	public void removeNode(int data) {
	}

	// 5: Legg til et element etter et element med oppgitt verdi
	public void addAfter(int data, int value) {
		if (isEmpty()) {
			System.out.println("Listen er tom.");
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
			System.out.println("Ingen elementer med verdien " + data + " i listen.\n");

		}
	}

	// 6: Legg til et element foran et element med oppgitt verdi
	public void addBefore(int data) {
	}

	// 7: Antall elementer i listen
	public int getLength() {
		int length = 0;
		if (isEmpty()) {
			return length;
		} else {
			Node current = head;
			length++;
			while (current != null) {
				current = current.next;
				length++;
			}
			return length;
		}
	}

	// 8: Skriv ut antall forekomster av elementer med oppgitt verdi
	public int countNodesWith(int value) {
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
			System.out.println("Det er ingen elementer i lista...");
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
		int deletedNodes = getLength();
		// TODO: SLETT LISTE
		System.out.println("Sletting vellykket! " + deletedNodes + " elementer ble slettet.\n");
	}

}
