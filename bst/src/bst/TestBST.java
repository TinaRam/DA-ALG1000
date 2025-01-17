package bst;

/**
 * @author tinarambo
 *
 */
public class TestBST {

	private static int executed = 0;
	private static int succeed = 0;

	/**
	 * @param test -- Det som testes (boolean test)
	 * @param expected -- Forventet resultat (true eller false)
	 * @param message -- Melding som beskriver utført test
	 * 
	 * ex: test(list1.head == null, true, "test beskrivelse");
	 */
	private static void test(boolean test, boolean expected, String message) {
		executed++;
		if (test == expected) {
			System.out.printf("Test %d: %s. Forventet %b, fikk %b --> Test OK!\n", executed, message, expected, test);
			System.out.println();
			succeed++;
		} else {
			System.out.printf("Tester om %s. Forventet %b, fikk %b --> MISLYKKET!\n", message, expected, test);
			System.out.println();
		}
	}

	private static void printTestReport() {
		System.out.println("Testresultat: " + (succeed / executed) * 100 + "% vellykket!");
	}

	public static void main(String[] args) {

		BST tree = new BST();
		int[] treeData = new int[] { 100, 35, 120, 10, 40, 110, 140, 5, 11, 37, 48, 105, 111, 130, 200 };
		tree.buildTree(treeData);

		// Print tre i console
		// KUN for å visualisere treet i oppgavebeskrivelsen { 100, 35, 120, 10, 40, 110, 140, 5, 11, 37, 48, 105, 111, 130, 200 }
		// Level: 0
		System.out.println("Level: 0                                " + tree.root); // 100
		System.out.println();
		System.out.println("                                   /           \\");
		System.out.println();
		// Level: 1
		System.out.println("Level: 1                       " + tree.root.left + "                " + tree.root.right);// 35 - 120
		System.out.println();
		System.out.println("                             /    \\             /    \\");
		System.out.println();
		// Level: 2
		System.out.print("Level: 2                  " + tree.root.left.left + "      " + tree.root.left.right); // 10 - 40
		System.out.println("         " + tree.root.right.left + "      " + tree.root.right.right); // 110 - 140
		System.out.println();
		System.out.println("                        / |      |  \\        /  |      |  \\");
		System.out.println();
		// Level: 3
		System.out.print("Level: 3               " + tree.root.left.left.left + "  " + tree.root.left.left.right); // 5 - 11
		System.out.print("     " + tree.root.left.right.left + "  " + tree.root.left.right.right); // 37 - 48
		System.out.print("   " + tree.root.right.left.left + "  " + tree.root.right.left.right); // 105 - 111
		System.out.println("   " + tree.root.right.right.left + "  " + tree.root.right.right.right); // 130 - 200
		System.out.println();
		System.out.println();

		//# Test: Bygg BST
		test(tree.size == 15, true, "Bygg BST");

		//# Test: Finn minste verdi
		test(tree.smallestKey() == 5, true, "Finn det minste tallet i BST");

		//# Test: Finn største verdi
		test(tree.largestKey() == 200, true, "Finn det største tallet i BST");

		//# Test: Finnes oppgitt verdi i treet
		// Finner 3 ulike indexer i treeData-array for å teste verdier som SKAL finnes i treet
		int valueInTree1 = treeData[0]; // første elementet i treeData-arrayet
		int valueInTree2 = treeData[treeData.length / 2]; // miderste elementet i treeData-arrayet
		int valueInTree3 = treeData[treeData.length - 1]; // siste elementet i treeData-arrayet

		test(tree.search(valueInTree1), true, "Sjekk om '" + valueInTree1 + "' er i BST");
		test(tree.search(valueInTree2), true, "Sjekk om '" + valueInTree2 + "' er i BST");
		test(tree.search(valueInTree3), true, "Sjekk om '" + valueInTree3 + "' er i BST");

		// sjekker med verdier som ikke skal være i treet
		test(tree.search(0), false, "Sjekk om '0' er i BST");
		test(tree.search(55), false, "Sjekk om '55' er i BST");
		test(tree.search(-10), false, "Sjekk om '-10' er i BST");

		// Skriv ut sammendrag av testing
		printTestReport();

		System.out.println("\n");
		System.out.print("PreOrder: { ");
		tree.printTree("pre");
		System.out.println("}");

		System.out.println();
		System.out.print("InOrder: { ");
		tree.printTree("in");
		System.out.println("}");

		System.out.println();
		System.out.print("PostOrder: { ");
		tree.printTree("post");
		System.out.println("}");
		System.out.println();
		System.out.println();

	}

}
