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

		// Tester LinkedList
		LinkedList list = new LinkedList();

	}

	public static void test(boolean test, boolean expected, String message) {
		if (test == expected) {
			System.out.printf("Tester %s: %b   OK\n", message, expected);
		} else {
			System.out.printf("Tester %s: F#*k...! Forventet %b, fikk %b\n", message, expected, test);
		}
	}
}
