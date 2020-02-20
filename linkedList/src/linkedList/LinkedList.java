package linkedList;

/**
 * @author tinarambo
 *
 */
public class LinkedList {

	public Node head;

	public void addToFront(int data) {
		Node newNode = new Node(data); // Henter node fra systemet. Fyller den med data. next = NULL
		newNode.next = head; // Justerer peker til å peke på den første noden i listen
		head = newNode; // Deklarerer ny node som head

		//		System.out.println("[ " + data + " ] " + "er lagt først i lista.");
	}

	// 1: Slett element først i listen
	public void removeFromFront() {
		if (head == null) {
			System.out.println("Lista er tom...");
		} else {
			int deletedNode = head.data;
			head = head.next;
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.");
		}
	}

	// 2: Legg til element i slutten av listen
	public void addToBack(int value) {
		Node newNode = new Node(value); // Henter node fra systemet og Fyller den med data (peker = null)

		if (head == null) {
			head = newNode;
		} else {
			Node last = head; // Lager en node som peker på samme som head
			while (last.next != null) { // om ikke last er siste elementet i lista
				last = last.next; // flytter last til neste node
			}

			last.next = newNode; // Justerer siste elements peker til å peke på ny node

			//			System.out.println("[ " + value + " ] " + "er lagt til slutten av lista.");
		}
	}

	// 3: Slett et element i slutten av listen
	public void removeFromBack() {
		if (head == null) {
			System.out.println("Lista er tom...");
		} else {
			Node current = head;
			Node prev = head;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			int deletedNode = current.data;
			if (current == head) {
				head = null;
			} else {
				prev.next = null;
			}
			System.out.println("Sletting vellykket! Node [ " + deletedNode + " ] er nå slettet.");
		}
	}

	// 4: Slett et element med oppgitt verdi (sletter kun den første verdien den finner)
	public void removeNodeWithValue(int value) {
		if (head == null) {
			System.out.println("Lista er tom...");
		} else {
			Node current = head;
			Node prev = head;

			if (current.data == value && current == head) { // Om noden som skal slettes er første noden i listen
				head = head.next; // Sletter første node
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
		}
	}

	// 5: Legg til et element etter et element med oppgitt verdi
	public void addAfterValue(int valueExistingNode, int valueNewNode) {
		if (head == null) {
			System.out.println("Lista er tom...");
		} else {

			Node current = head;
			while (current != null && current.data != valueExistingNode) { // Så lenge noden ikke er tom eller har oppgitt verdi...
				current = current.next; // Gå til neste element
			}

			if (current != null) { // verdi funnet
				Node newNode = new Node(valueNewNode);
				newNode.next = current.next; // Juster peker ny node til å peke på current sin neste
				current.next = newNode; // Juster peker current til å peke på ny node
			} else {
				System.out.println("Lista har ingen elementer med verdien '" + valueExistingNode + "'!");
			}
		}
	}

	// 6: Legg til et element foran et element med oppgitt verdi
	public void addBeforeValue(int valueExistingNode, int valueNewNode) {
		if (head == null) {
			System.out.println("Lista er tom...");
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
					Node newNode = new Node(valueNewNode);
					newNode.next = current;
					prev.next = newNode;
					System.out.println(valueNewNode + " ble lagt i listen før node " + valueExistingNode + ".");
				} else {
					System.out.println("Det finnes ingen elementer med verdien '" + valueExistingNode + "' i lista.");
				}
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
			System.out.println("Det er " + length + " element i lista.");
		} else {
			System.out.println("Det er " + length + " elementer i lista.");
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
			System.out.println("Det er " + instances + " element med verdien '" + value + "'.");
		} else {
			System.out.println("Listen har " + instances + " elementer med verdien '" + value + "'.");
		}
	}

	// 9: Skriv ut hele listen
	public void printList() {
		if (head == null) {
			System.out.println("Lista er tom...");
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
		if (deletedNodes == 0) {
			System.out.println("Lista er allerede tom...Ingen elementer slettet.");
		} else {
			System.out.println("Liste med " + deletedNodes + " elementer slettet.");
		}
	}

	// kun for testing
	public String getListAsString() {
		String s;

		if (head == null) {
			s = "Lista er tom...";
		} else {
			s = "head -->";
			Node current = head;
			while (current != null) {
				s += " [ " + current.data + " ] ";
				if (current.next != null) {
					s += "-->";
				}
				current = current.next;
			}
			s += "~~";
		}
		return s;
	}

}
