package linkedList;

/**
 * @author tinarambo
 *
 */
public class LinkedList {

	public Node head;

	public void addToFront(int data) {
		Node newNode = new Node(); // Henter node fra systemet. Data og next = NULL
		newNode.data = data; // Fyller den med data
		newNode.next = head; // Justerer peker til å peke på den første noden i listen
		head = newNode; // Deklarerer ny node som head

		System.out.println(data + " ble lagt først i lista.");
		printList();
	}

	// 1: Slett element først i listen
	public void removeFromFront() {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {
			int deletedNode = head.data;
			head = head.next;
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.\n");

			printList();
		}
	}

	// 2: Legg til element i slutten av listen
	public void addToBack(int value) {
		if (head == null) {
			addToFront(value);
		} else {
			Node last = head; // Lager en node som peker på samme som head
			while (last.next != null) { // om ikke last er siste elementet i lista
				last = last.next; // flytter last til neste node
			}
			Node newNode = new Node(); // Henter node fra systemet
			newNode.data = value; // Fyller den med data (peker = null)
			last.next = newNode; // Justerer siste elements peker til å peke på ny node

			System.out.println(value + " lagt til slutten av lista.");
			printList();
		}
	}

	// 3: Slett et element i slutten av listen
	public void removeFromBack() {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {
			Node current = head;
			Node prev = head;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			int deletedNode = current.data;
			if (current == head) {
				head = head.next; // head.next vil være null på dette tidspunktet
			} else {
				prev.next = current.next; // current.next vil være null på dette tidspunktet
			}
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.\n");
			printList();
		}
	}

	// 4: Slett et element med oppgitt verdi (sletter kun den første verdien den finner)
	public void removeNodeWithValue(int value) {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {
			Node current = head;
			Node prev = head;

			if (current.data == value && current == head) { // Om noden som skal slettes er første noden i listen
				head = current.next; // Sletter første node
			}

			while (current != null && current.data != value) { // Om current ikke er tom eller har verdi som skal slettes...
				prev = current;
				current = current.next; // Gå til neste node...
			}

			if (current != null) { // Om current har en verdi etter while-løkka så inneholder den verdien som skal slettes 
				prev.next = current.next;
				System.out.println("Node med verdi '" + value + "' ble slettet fra lista!");
			} else {
				System.out.println("Ingen node med verdien '" + value + "' i lista!");
			}
			printList();
		}
	}

	// 5: Legg til et element etter et element med oppgitt verdi
	public void addAfterValue(int valueExistingNode, int valueNewNode) {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {

			Node current = head;
			while (current != null && current.data != valueExistingNode) { // Så lenge noden ikke er tom eller har oppgitt verdi...
				current = current.next; // Gå til neste element
			}

			if (current != null) { // verdi funnet
				Node newNode = new Node();
				newNode.data = valueNewNode;
				newNode.next = current.next; // Juster peker ny node til å peke på current sin neste
				current.next = newNode; // Juster peker current til å peke på ny node
			} else {
				System.out.println("Lista har ingen elementer med verdien '" + valueExistingNode + "'!\n");
			}
			printList();
		}
	}

	// 6: Legg til et element foran et element med oppgitt verdi
	public void addBeforeValue(int valueExistingNode, int valueNewNode) {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {

			if (head.data == valueExistingNode) {
				addToFront(valueNewNode);
			} else {
				Node current = head;
				Node prev = null;

				while (current != null && current.data != valueExistingNode) {
					prev = current;
					current = current.next;
				}

				if (current != null) {
					Node newNode = new Node();
					newNode.data = valueNewNode;
					newNode.next = current;
					prev.next = newNode;
					System.out.println(valueNewNode + " ble lagt listen før node " + valueExistingNode + ".\n");
				} else {
					System.out.println("Det finnes ingen elementer med verdien '" + valueExistingNode + "' i lista.\n");
				}
				printList();
			}
		}
	}

	// 7: Skriv ut lengden på listen
	public void printListLength() {
		int length = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			length++;
		}
		if (length == 1) {
			System.out.println("Det er " + length + " element i lista.\n");
		} else {
			System.out.println("Det er " + length + " elementer i lista.\n");
		}
	}

	// 8: Skriv ut antall forekomster elementer med oppgitt verdi
	public void printInstancesOfValue(int value) {
		int instances = 0;
		Node current = head;

		while (current != null) {
			if (current.data == value) {
				instances++;
			}
			current = current.next;
		}

		if (instances == 1) {
			System.out.println("Det er " + instances + " element med verdien '" + value + "'.\n");
		} else {
			System.out.println("Listen har " + instances + " elementer med verdien '" + value + "'.\n");
		}
	}

	// 9: Skriv ut hele listen
	public void printList() {
		if (head == null) {
			System.out.println("Lista er tom...\n");
		} else {
			System.out.print("head -->");
			Node current = head;
			while (current != null) {
				current.printNodeData();
				if (current.next != null) {
					System.out.print("-->");
				}
				current = current.next;
			}
			System.out.println("~~\n");
		}
	}

	// 10: Slett listen og vis antall slettede elementer
	public void deleteList() {
		int deletedNodes = 0;
		while (head != null) {
			head = head.next;
			deletedNodes++;
		}
		System.out.println("Liste med " + deletedNodes + " elementer slettet.\n");
	}

}
