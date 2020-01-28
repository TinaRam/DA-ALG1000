package linkedList;

/**
 * @author tinarambo
 *
 */
public class Menu {

	public void start() {
		printMenuItems();
		runMenu();
	}

	private void printMenuItems() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("       Simlple Linked List                                        ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("                                                                  ");
		System.out.println("  1: Slett element først i listen                                 ");
		System.out.println("  2: Legg til element i slutten av listen                         ");
		System.out.println("  3: Slett et element i slutten av listen                         ");
		System.out.println("  4: Slett et element med oppgitt verdi                           ");
		System.out.println("  5: Legg til et element etter et element med oppgitt verdi       ");
		System.out.println("  6: Legg til et element foran et element med oppgitt verdi       ");
		System.out.println("  7: Skriv ut lengden på listen                                   ");
		System.out.println("  8: Skriv ut antall forekomster av elementer med oppgitt verdi   ");
		System.out.println("  9: Skriv ut hele listen                                         ");
		System.out.println(" 10: Slett listen og vis antall slettede elementer                ");
		System.out.println("                                                                  ");
		System.out.println("  0: AVSLUTT PROGRAMMET                                           ");
		System.out.println("------------------------------------------------------------------");
	}

	private void runMenu() {

		LinkedList list = new LinkedList();
		boolean run = true;
		int menuItem = 0;

		do {
			Reader in = new Reader();
			menuItem = in.readInt("Tast inn menynummer: ");

			// 0: Close program and print exit message
			if (menuItem == 0) {

				run = false;
				System.out.println();
				System.out.println("##################################################################");
				System.out.println("#                                                                #");
				System.out.println("#     PROGRAM AVSLUTTET                                          #");
				System.out.println("#                                                                #");
				System.out.println("##################################################################");

			} // 1: Slett element først i listen
			else if (menuItem == 1) {

				list.removeFirst();

			} // 2: Legg til element i slutten av listen
			else if (menuItem == 2) {

				list.addLast();

			} // 3: Slett et element i slutten av listen
			else if (menuItem == 3) {

				list.removeLast();

			} // 4: Slett et element med oppgitt verdi
			else if (menuItem == 4) {

				list.removeNode(in.readInt("Tast inn verdi som skal slettes: "));

			} // 5: Legg til et element etter et element med oppgitt verdi
			else if (menuItem == 5) {

				list.addAfter(in.readInt("Tast inn verdien elementet skal legges etter: "));

			} // 6: Legg til et element foran et element med oppgitt verdi
			else if (menuItem == 6) {

				list.addBefore(in.readInt("Tast inn verdien elementet skal legges foran: "));

			} // 7: Skriv ut lengden på listen
			else if (menuItem == 7) {

				System.out.println("Listen har " + list.getLength() + " elementer.\n");

			} // 8: Skriv ut antall forekomster av elementer med oppgitt verdi
			else if (menuItem == 8) {

				int value = in.readInt("Vis antall elementer med verdi: ");
				System.out.println(
						"Listen har " + list.countNodesWith(value) + " elementer med verdien " + value + ".\n");

			} // 9: Skriv ut hele listen
			else if (menuItem == 9) {

				list.printList();

			} // 10: Slett listen og vis antall slettede elementer
			else if (menuItem == 10) {

				list.deleteList();

			} // 11: print menyvalg på nytt
			else if (menuItem == 11) {

				printMenuItems();

			} else {
				System.out.println();
				System.out.println(menuItem + " er ikke et gyldig menyvalg (Gyldig menyvalg 1-10)");
				System.out.println("Tast '11' for å se menyen på nytt eller '0' for å avslutte");
				System.out.println();
			}
		} while (run);

	} // -- runMenu END --

}
