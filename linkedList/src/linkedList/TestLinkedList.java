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

		// 1: Slett element først i listen
		LinkedList list = new LinkedList();
		System.out.println("****** START TEST 1 - Slett element først i listen: ******\n");

		// Tom liste
		System.out.println("Slett første element fra tom liste. ( head ~~ )");
		list.removeFromFront();
		System.out.println();

		// Liste med 1 element
		list.addToFront(1);
		System.out.print("Slett første element fra liste med ett element. ( " + list.getListAsString() + " )\n");
		list.removeFromFront();
		System.out.println();

		// Liste med flere elementer
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Slett første element fra liste med flere elementer. ( " + list.getListAsString() + " )\n");
		list.removeFromFront();
		System.out.println("\n****** SLUTT TEST 1 ****** \n");

		list.head = null;
		System.out.println();

		// 2: Legg til element i slutten av listen
		System.out.println("****** START TEST 2 - Legg til element i slutten av listen: ******\n");

		// Tom liste
		System.out.println("Legg til '1' i slutten når liste er tom. ( head ~~ )");
		list.addToBack(1);
		list.printList();

		// Liste med 1 element
		System.out.print("Legg til '2' i slutten når liste har ett element. ( " + list.getListAsString() + " )\n");
		list.addToBack(2);
		list.printList();

		// Liste med flere elementer
		System.out.print("Legg til '3' i slutten når liste har flere elementer. ( " + list.getListAsString() + " )\n");
		list.addToBack(3);
		list.printList();
		System.out.println("\n****** SLUTT TEST 2 ****** \n");

		list.head = null;
		System.out.println();

		// 3: Slett et element i slutten av listen
		System.out.println("****** START TEST 3 - Slett et element i slutten av listen: ******\n");

		// Tom liste
		System.out.println("Slett siste element fra tom liste. ( head ~~ )");
		list.removeFromBack();
		System.out.println();

		// Liste med 1 element
		list.addToBack(1);
		System.out.print("Slett siste element fra liste med ett element. ( " + list.getListAsString() + " )\n");
		list.removeFromBack();
		System.out.println();

		// Liste med flere elementer
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Slett siste element fra liste med flere elementer. ( " + list.getListAsString() + " )\n");
		list.removeFromBack();
		System.out.println("\n****** SLUTT TEST 3 ****** \n");

		list.head = null;
		System.out.println();

		// 4: Slett et element med oppgitt verdi
		System.out.println("****** START TEST 4 - Slett et element med oppgitt verdi: ******\n");

		// Tom liste
		System.out.println("Slett element '0' når liste er tom. ( head ~~ )");
		list.removeNodeWithValue(0);
		System.out.println();

		// Liste uten oppgitt verdi
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Slett element '0' når liste ikke har element '0'. ( " + list.getListAsString() + " )\n");
		list.removeNodeWithValue(0);
		System.out.println();

		// Oppgitt verdi i head
		list.addToFront(0);
		System.out.print("Slett element '0' når '0' er første node ( " + list.getListAsString() + " )\n");
		list.removeNodeWithValue(0);
		System.out.println();

		// Liste har flere noder med oppgitt verdi
		list.addAfterValue(1, 0);
		list.addToBack(0);
		System.out.print("Slett element '0' når liste har flere noder med '0' ( " + list.getListAsString() + " )\n");
		list.removeNodeWithValue(0);
		list.printList();

		// Oppgitt verdi siste node
		System.out.print("Slett element '0' når '0' er siste node ( " + list.getListAsString() + " )\n");
		list.removeNodeWithValue(0);
		list.printList();

		System.out.println("****** SLUTT TEST 4 ****** \n");

		list.head = null;
		System.out.println();

		// 5: Legg til et element etter et element med oppgitt verdi
		System.out.println("****** START TEST 5 - Legg til et element etter et element med oppgitt verdi: ******\n");

		// Tom liste
		System.out.println("Legg til '9' etter '0' når liste er tom. ( head ~~ )");
		list.addAfterValue(0, 9);
		System.out.println();

		// Liste uten oppgitt verdi
		list.addToBack(1);
		list.addToBack(2);
		System.out.print("Legg til '9' etter '0' når liste ikke har '0'. ( " + list.getListAsString() + " )\n");
		list.addAfterValue(0, 9);
		System.out.println();

		// Oppgitt verdi i head
		list.addToFront(0);
		System.out.print("Legg til '9' etter '0' når '0' er første node ( " + list.getListAsString() + " )\n");
		list.addAfterValue(0, 9);
		list.printList();

		// Liste har flere noder med oppgitt verdi
		list.head = null;
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		list.addAfterValue(1, 0);
		list.addAfterValue(2, 0);
		System.out.print("Legg til '9' etter '0' når liste har flere noder '0' ( " + list.getListAsString() + " )\n");
		list.addAfterValue(0, 9);
		list.printList();

		// Oppgitt verdi siste node
		list.head = null;
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(0);
		System.out.print("Legg til '9' etter '0' når '0' er siste node ( " + list.getListAsString() + " )\n");
		list.addAfterValue(0, 9);
		list.printList();

		System.out.println("****** SLUTT TEST 5 ****** \n");

		list.head = null;
		System.out.println();

		// 6: Legg til et element foran et element med oppgitt verdi
		System.out.println("****** START TEST 6 - Legg til et element foran et element med oppgitt verdi: ******\n");

		// Tom liste
		System.out.println("Legg til '9' foran '0' når liste er tom. ( head ~~ )");
		list.addBeforeValue(0, 9);
		System.out.println();

		// Liste uten oppgitt verdi
		list.addToBack(1);
		list.addToBack(2);
		System.out.print("Legg til '9' foran '0' når liste ikke har '0'. ( " + list.getListAsString() + " )\n");
		list.addBeforeValue(0, 9);
		System.out.println();

		// Oppgitt verdi i head
		list.addToFront(0);
		System.out.print("Legg til '9' foran '0' når '0' er første node ( " + list.getListAsString() + " )\n");
		list.addBeforeValue(0, 9);
		list.printList();

		// Liste har flere noder med oppgitt verdi
		list.head = null;
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		list.addAfterValue(1, 0);
		list.addAfterValue(2, 0);
		System.out.print("Legg til '9' foran '0' når liste har flere noder '0' ( " + list.getListAsString() + " )\n");
		list.addBeforeValue(0, 9);
		list.printList();

		// Oppgitt verdi siste node
		list.head = null;
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(0);
		System.out.print("Legg til '9' foran '0' når '0' er siste node ( " + list.getListAsString() + " )\n");
		list.addBeforeValue(0, 9);
		list.printList();

		System.out.println("****** SLUTT TEST 6 ****** \n");

		list.head = null;
		System.out.println();

		// 7: Skriv ut lengden på listen
		System.out.println("****** START TEST 7 - Skriv ut lengden på listen: ******\n");

		// Liste er tom
		System.out.println("Skriv ut lengden på listen når den er tom. ( head ~~ )");
		list.printListLength();
		System.out.println();

		// Liste ikke er tom
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Skriv ut lengden på listen når den ikke er tom.  ( " + list.getListAsString() + " )\n");
		list.printListLength();

		System.out.println("\n****** SLUTT TEST 7 ****** \n");

		list.head = null;
		System.out.println();

		// 8: Skriv ut antall forekomster av elementer med oppgitt verdi

		System.out
				.println("****** START TEST 8 - Skriv ut antall forekomster av elementer med oppgitt verdi: ******\n");

		// Liste er tom
		System.out.println("Antall forekomster av '0' når lista er tom. ( head ~~ )");
		list.printInstancesOfValue(0);
		System.out.println();

		// Liste har ikke oppgitt verdi
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Antall forekomster av '0' når liste ikke har '0'. ( " + list.getListAsString() + " )\n");
		list.printInstancesOfValue(0);
		System.out.println();

		// Liste har oppgitt verdi
		list.head = null;
		list.addToBack(0);
		list.addToBack(1);
		list.addToBack(0);
		list.addToBack(0);
		list.addToBack(2);
		list.addToBack(3);
		list.addToBack(0);
		System.out.print("Antall forekomster av '0' når liste ikke har '0'. ( " + list.getListAsString() + " )\n");
		list.printInstancesOfValue(0);

		System.out.println("\n****** SLUTT TEST 8 ****** \n");

		list.head = null;
		System.out.println();

		// 9: Skriv ut hele listen
		System.out.println("****** START TEST 9 - Skriv ut hele listen: ******\n");

		// Liste er tom
		System.out.println("Skriv ut hele listen når den er tom. ( head ~~ )");
		list.printList();
		System.out.println();

		// Liste ikke er tom
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Skriv ut hele listen når den ikke er tom.  ( " + list.getListAsString() + " )\n");
		list.printList();

		System.out.println("****** SLUTT TEST 9 ****** \n");

		list.head = null;
		System.out.println();

		// 10: Slett listen og vis antall slettede elementer
		System.out.println("****** START TEST 10 - Slett listen og vis antall slettede elementer: ******\n");

		// Liste er tom
		System.out.println("Slett listen når liste er tom. ( head ~~ )");
		list.deleteList();
		System.out.println();

		// Liste ikke er tom
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		System.out.print("Slett listen når liste ikke er tom.  ( " + list.getListAsString() + " )\n");
		list.deleteList();

		System.out.println("\n****** SLUTT TEST 10 ****** \n");

		//		test(list1.head == null, true, "test-metode");
	}

	/**
	 * @param test -- Metode som testes
	 * @param expected -- Forventet resultat?
	 * @param message -- Print melding som forklarer hva som er testet
	 * 
	 * ex: test(list1.head == null, true, "test-metode");
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
