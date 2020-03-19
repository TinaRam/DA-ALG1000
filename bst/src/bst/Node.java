package bst;

/**
 * @author tinarambo
 * 
 * Klasse som representerer en node (evt. et subtre) i et tre.
 * Hver node har en int 'key' som holder nøkkelverdien til noden
 * og to pekere, referanser til høyre og venstre barn av typen Node.
 */
public class Node {

	protected int key;
	protected Node left;
	protected Node right;

	/**
	 * @param data
	 * Initialiserer en Node med nøkkelverdien [data]
	 * Høyre og venstre barn = NULL
	 */
	public Node(int data) {
		key = data;
		left = right = null;
	}

	/**
	 * @return strengrepresentasjonen av objektet Node
	 * 
	 * Printer nøkkelverdien til en node som streng 
	 * istedenfor standard utskrift som ville printet referansen til objektet (adressen)
	 */
	public String toString() {
		return "" + key;
	}
}
