package linkedList;

/**
 * @author tinarambo
 * 
 * Testklasse for å sjekke at klassene kjører som forventet.
 * 
 * Se: http://folk.uio.no/krihus/inf1010/v16/enhetstesting_doc.html
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// # Tester: LinkedList
		LinkedList list = new LinkedList(); // instansierer listen. Inneholder kun head = null

		// Test: isEmpty()
		// test(list.isEmpty(), true, "om liste er tom");
		// System.out.println();

		//		Random random = new Random();
		//		for (int i = 0; i < 5; i++) {
		//			list.addToFront(random.nextInt(9) + 1);
		//		}
		//		System.out.println("Instansiert liste med 5 elementer");
		//		list.printList();

		// list.removeFromFront();
		// list.printList();

		list.addToBack(3);
		list.addToBack(7);
		list.addToBack(1);
		//		System.out.println("Instansiert liste med 11 elementer");
		//		System.out.println("Antall noder med niere: " + list.countNodesWithValue(9));
		list.printList();

		list.addBeforeValue(1, 0);
		list.printList();

		list.addBeforeValue(3, 0);
		list.printList();
		list.addBeforeValue(30, 99);
		list.printList();

		list.deleteList();
		list.printList();

		for (int i = 0; i < 10; i++) {
			list.addToBack(10);
		}
		System.out.println("Antall noder: " + list.getListLength());
		list.printList();

		//		list.addAfterValue(3, 100);
		//		System.out.println("Legg til 100 etter verdien 3:");
		//		list.printList();

		//		System.out.println("Slett node med verdien 9:");
		//		list.removeNodeWithValue(9);
		//		list.printList();

		//		System.out.println("Slett noder med verdien 3:");
		//		list.removeNodeWithValue(3);
		//		list.printList();

		// System.out.println("Slett bakerste node:");
		// list.removeFromBack();
		// list.printList();
	}

	/**
	 * @param test -- Hvilken test som skal kjøres?
	 * @param expected -- Hva forventes det at testen skal gi?
	 * @param message -- Printe en melding for å identifisere hvilken test det er
	 * snakk om
	 */
	public static void test(boolean test, boolean expected, String message) {
		if (test == expected) {
			// System.out.printf("Tester %s: %b OK!\n", message, expected);
			// System.out.println();
		} else {
			System.out.printf("Tester %s: F#*k...! Forventet %b, fikk %b. TEST FAILED!\n", message, expected, test);
			System.out.println();
		}
	}
}
