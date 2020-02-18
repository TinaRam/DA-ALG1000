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
		System.out.println("     Simlple Linked List MENU                                     ");
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

			switch (menuItem) {
			// 0: Close program and print exit message
			case 0:
				run = false;
				System.out.println();
				System.out.println("##################################################################");
				System.out.println("#                                                                #");
				System.out.println("#     PROGRAM AVSLUTTET                                          #");
				System.out.println("#                                                                #");
				System.out.println("##################################################################");
				break;
			// 1: Slett element først i listen	
			case 1:
				list.removeFromFront();
				break;
			// 2: Legg til element i slutten av listen
			case 2:
				list.addToBack(in.readInt("Tast inn verdi på ny node: "));
				break;
			// 3: Slett et element i slutten av listen
			case 3:
				list.removeFromBack();
				break;
			// 4: Slett et element med oppgitt verdi
			case 4:
				list.removeNodeWithValue(in.readInt("Tast inn verdi som skal slettes: "));
				break;
			// 5: Legg til et element etter et element med oppgitt verdi
			case 5:
				int dataExistingNode = in.readInt("Tast inn hvilken verdi den nye noden skal plasseres etter: ");
				int valueNewNode = in.readInt("Tast inn verdien til ny node: ");
				list.addAfterValue(dataExistingNode, valueNewNode);
				break;
			// 6: Legg til et element foran et element med oppgitt verdi
			case 6:
				int val = in.readInt("Tast inn verdien den nye noden skal ligge før: ");
				int dataNewNode1 = in.readInt("Tast inn verdien til ny node: ");
				list.addBeforeValue(val, dataNewNode1);
				break;
			// 7: Skriv ut lengden på listen
			case 7:
				list.printListLength();
				break;
			// 8: Skriv ut antall forekomster av elementer med oppgitt verdi
			case 8:
				if (list.head == null) {
					System.out.println("Lista er tom... \n");
				} else {
					list.printInstancesOfValue(in.readInt("Vis antall elementer med verdi: "));
				}
				break;
			// 9: Skriv ut hele listen
			case 9:
				list.printList();
				break;
			// 10: Slett listen og vis antall slettede elementer
			case 10:
				list.deleteList();
				break;
			// 11: print menyvalg på nytt
			case 11:
				printMenuItems();
				break;
			default:
				System.out.println();
				System.out.println(menuItem + " er ikke et gyldig menyvalg (Gyldig menyvalg 1-10)");
				System.out.println("Tast '11' for å se menyen på nytt eller '0' for å avslutte");
				System.out.println();
				break;
			}

		} while (run);

	} // -- runMenu END --

}
