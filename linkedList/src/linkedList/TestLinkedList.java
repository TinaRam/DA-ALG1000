package linkedList;

/**
 * @author tinarambo
 * 
 * Testklasse for å sjekke at klassene kjører som forventet.
 * 
 * Se: http://folk.uio.no/krihus/inf1010/v16/enhetstesting_doc.html
 */
public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// # ENDRE TESTKLASSE TIL Å KJØRE ALLE PLANLAGTE TESTER MED UTSKRIFT FOR HVER TEST!

		// 1: Slett element først i listen
		LinkedList list1 = new LinkedList();
		System.out.println("1: Slett element først i listen");
		System.out.println();

		// Tom liste
		System.out.print("Slett første element fra tom liste --> ");
		list1.removeFromFront();
		System.out.println();

		// Liste med 1 element
		list1.addToFront(10);
		System.out.print("Liste med 1 element: ");
		list1.removeFromFront();
		System.out.println();

		// Liste med flere elementer
		list1.addToBack(1);
		list1.addToBack(2);
		list1.addToBack(3);
		list1.addToBack(4);
		System.out.print("Liste med fire elementer: ");
		list1.removeFromFront();
		System.out.println();

		// 2: Legg til element i slutten av listen

		// 3: Slett et element i slutten av listen

		// 4: Slett et element med oppgitt verdi

		// 5: Legg til et element etter et element med oppgitt verdi

		// 6: Legg til et element foran et element med oppgitt verdi

		// 7: Skriv ut lengden på listen

		// 8: Skriv ut antall forekomster av elementer med oppgitt verdi

		// 9: Skriv ut hele listen

		// 10: Slett listen og vis antall slettede elementer

		test(list1.head == null, true, "");
	}

	/**
	 * @param test -- Metode som testest
	 * @param expected -- Forventet resultat?
	 * @param message -- Print melding som forklarer hva som er testet
	 */
	public static void test(boolean test, boolean expected, String message) {
		if (test == expected) {
			System.out.printf("Tester %s: %b OK!\n", message, expected);
			System.out.println();
		} else {
			System.out.printf("Tester %s: F#*k...! Forventet %b, fikk %b. TEST FAILED!\n", message, expected, test);
			System.out.println();
		}
	}
}
