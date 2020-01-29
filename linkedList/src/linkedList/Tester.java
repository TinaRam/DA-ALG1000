package linkedList;

import java.util.Random;

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
		test(list.isEmpty(), true, "om liste er tom");

		System.out.println();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			list.addFirst(random.nextInt(8));
			list.printList();
		}

		list.removeFirst();
		list.printList();

		list.addLast(9);
		list.addLast(3);
		list.addFirst(8);
		list.printList();

		System.out.print("Antall noder med verdien 9: ");
		System.out.println(list.countNodesWith(9));

		list.addAfter(9, 100);
		list.printList();
	}

	/**
	 * @param test -- Hvilken test som skal kjøres?
	 * @param expected -- Hva forventes det at testen skal gi?
	 * @param message -- Printe en melding for å identifisere hvilken test det er
	 * snakk om
	 */
	public static void test(boolean test, boolean expected, String message) {
		if (test == expected) {
			System.out.printf("Tester %s: %b   OK!\n", message, expected);
		} else {
			System.out.printf("Tester %s: F#*k...! Forventet %b, fikk %b\n", message, expected, test);
		}
	}
}
