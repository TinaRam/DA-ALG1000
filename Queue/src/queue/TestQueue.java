package queue;

/**
 * @author tinarambo
 *
 */
public class TestQueue {

	static Queue a = new Queue();
	static Queue b = new Queue();
	static Queue c = new Queue();
	static int initialLength = 0;
	static String result;

	public static void test() {
		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
	}

	public static void main(String[] args) {

		// TEST 1:
		System.out.println("#########  TEST 1: Kø A og B har lik lengde  ###############################\n");

		a.enqueue(5);
		a.enqueue(10);
		a.enqueue(15);
		System.out.print("A: " + a.toString());

		b.enqueue(2);
		b.enqueue(3);
		b.enqueue(20);
		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!!";
		} else {
			result = "COMPLETE";
		}
		System.out.println("\n#########  TEST 1: " + result + "  ###############################################\n\n");

		c.deleteNodes();

		// END TEST 1 

		// TEST 2:
		System.out.println("#########  TEST 2: Kø A og B har ulik lengde  ##############################\n");

		a.enqueue(5);
		a.enqueue(10);
		a.enqueue(28);
		a.enqueue(33);
		System.out.print("A: " + a.toString());

		b.enqueue(3);
		b.enqueue(20);
		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
		System.out.println("\n#########  TEST 2: " + result + "  ###############################################\n\n");

		c.deleteNodes();

		// END TEST 2 

		// TEST 3:
		System.out.println("#########  TEST 3: A har en node, B har mange ##############################\n");

		a.enqueue(5);
		System.out.print("A: " + a.toString());

		b.enqueue(0);
		b.enqueue(2);
		b.enqueue(3);
		b.enqueue(20);
		b.enqueue(33);
		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
		System.out.println("\n#########  TEST 3: " + result + "  ################################################\n\n");

		c.deleteNodes();

		// END TEST 3 

		// TEST 4:
		System.out.println("#########  TEST 4: Kø A er tom #############################################\n");

		System.out.print("A: " + a.toString());

		b.enqueue(2);
		b.enqueue(3);
		b.enqueue(20);
		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
		System.out.println("\n#########  TEST 4: " + result + "  ################################################\n\n");

		c.deleteNodes();

		// END TEST 4 

		// TEST 5:
		System.out.println("#########  TEST 5: Kø B er tom #############################################\n");

		a.enqueue(5);
		a.enqueue(10);
		a.enqueue(15);
		System.out.print("A: " + a.toString());

		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
		System.out.println("\n#########  TEST 5: " + result + "  ################################################\n\n");

		c.deleteNodes();

		// END TEST 5 

		// TEST 6:
		System.out.println("#########  TEST 6: Både A og B er tomme ####################################\n");

		System.out.print("A: " + a.toString());

		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		if (initialLength != c.getLength()) {
			result = "FAILED!";
		} else {
			result = "SUCCESS";
		}
		System.out.println("\n#########  TEST 6: " + result + "  ################################################\n\n");

		c.deleteNodes();

		// END TEST 6 

		// TEST 7:
		System.out.println("#########  TEST 7: Køer med både positive og negative verdier ##############\n");

		a.enqueue(-23);
		a.enqueue(0);
		a.enqueue(28);
		a.enqueue(33);
		System.out.print("A: " + a.toString());

		b.enqueue(-3);
		b.enqueue(20);
		System.out.print("B: " + b.toString());

		initialLength = a.getLength() + b.getLength();

		c = a.mergeQueuesAscending(a, b);
		System.out.print("C: " + c.toString());

		System.out.println("\n#########  TEST 7: " + result + "  ################################################\n\n");

		c.deleteNodes();

		// END TEST 7 
	}

}
