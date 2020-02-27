package stack;

/**
 * @author tinarambo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack stabel1 = new Stack();
		stabel1.push(15);
		stabel1.push(10);
		stabel1.push(5);
		stabel1.printStack();

		Stack stabel2 = new Stack();
		stabel2.push(20);
		stabel2.push(3);
		stabel2.push(2);
		stabel2.printStack();
	}

}
