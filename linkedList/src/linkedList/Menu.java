package linkedList;

import java.util.Scanner;

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

	private <D> void runMenu() {
		LinkedList<D> list = new LinkedList<D>();
		boolean run = true;
		int menuItem = 0;

		do {
			try {
				System.out.print("Tast inn menynummer: ");
				Scanner in = new Scanner(System.in);
				menuItem = in.nextInt();

				if (menuItem == 0) {
					run = false; // Close program
					in.close(); // Close scanner

					System.out.println();
					System.out.println("##################################################################");
					System.out.println("#                                                                #");
					System.out.println("#     PROGRAM AVSLUTTET                                          #");
					System.out.println("#                                                                #");
					System.out.println("##################################################################");

				} else if (menuItem == 1) { // 1: Slett element først i listen
					list.removeFirst();
				} else if (menuItem == 2) { // 2: Legg til element i slutten av listen
					list.addLast();
				} else if (menuItem == 3) { // 3: Slett et element i slutten av listen
					list.removeLast();
				} else if (menuItem == 4) { // 4: Slett et element med oppgitt verdi

					try {
						list.removeNode(in.nextInt());
					} catch (Exception e) {
						System.out.println("Oppgitt verdi må være et tall!");
					}

				} else if (menuItem == 5) { // 5: Legg til et element etter et element med oppgitt verdi

					try {
						list.addAfter(in.nextInt());
					} catch (Exception e) {
						System.out.println("Oppgitt verdi må være et tall!");
					}

				} else if (menuItem == 6) { // 6: Legg til et element foran et element med oppgitt verdi

					try {
						list.addBefore(in.nextInt());
					} catch (Exception e) {
						System.out.println("Oppgitt verdi må være et tall!");
					}

				} else if (menuItem == 7) { // 7: Skriv ut lengden på listen
					System.out.println("Listen har " + list.getLength() + " elementer.");
				} else if (menuItem == 8) { // 8: Skriv ut antall forekomster av elementer med oppgitt verdi

					try {
						int value = in.nextInt();
						System.out.println(
								"Listen har " + list.countNodesWith(value) + " elementer med verdien " + value + ".");
					} catch (Exception e) {
						System.out.println("Oppgitt verdi må være et tall!");
					}

				} else if (menuItem == 9) { // 9: Skriv ut hele listen
					list.printList();
				} else if (menuItem == 10) { // 10: Slett listen og vis antall slettede elementer
					list.deleteList();
				} else if (menuItem == 11) { // print menyvalg på nytt
					printMenuItems();
				} else {
					System.out.println();
					System.out.println(menuItem + " er ikke et gyldig menyvalg (Gyldig menyvalg 1-10)");
					System.out.println("Tast '11' for å se menyen på nytt eller '0' for å avslutte");
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println();
				System.out.println("Beklager, kun tall tillatt!");
				System.out.println("Vennligst tast inn et gyldig menyvalg (tall 1-10)");
				System.out.println("Tast '11' for å se menyen på nytt. Tast '0' for å avslutte");
				System.out.println();
			}

		} while (run);

	} // -- runMenu END --

}
