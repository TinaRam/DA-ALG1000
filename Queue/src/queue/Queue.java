package queue;

/**
 * @author tinarambo
 *
 * FIFO - First In First out
 * Insert to back (tail)
 * Remove from front
 */
public class Queue {

	Node front, tail;

	// Initialize
	public Queue() {
		front = tail = null;
	}

	// add node (tail)
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (front == null) {
			front = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// remove node (front)
	public void dequeue() {
		if (front == null) {
			System.out.println("Køen er tom...\n");
		} else {
			front = front.next;
			if (front == null) { // Hvis det bare var en node i køen før sletting, fjern tail-ref og
				tail = null;
			}
		}
	}

	// print queue
	public void printQueue() {
		if (front == null) {
			System.out.println("Køen er tom...\n");
		} else {
			Node current = front;
			System.out.print("Front -> ");
			while (current != null) {
				current.printNodeData();
				if (current.next != null) {
					System.out.print("-->");
				}
				current = current.next;
			}
			System.out.println("~~\n");
		}
	}

	public Queue mergeQueuesAscending(Queue a, Queue b) {
		Queue mergedQueue = new Queue();

		while (a.front != null && b.front != null) { // Så lenge hverken a eller b er tomme

			if (a.front.data <= b.front.data) { // hvis første node a er mindre enn eller lik første node b
				mergedQueue.enqueue(a.front.data); // legger verdien til a i den nye køen
				a.dequeue();
			} else { // b har den minste verdien
				mergedQueue.enqueue(b.front.data); // legger verdien til b i den nye køen
				b.dequeue();
			}
		}

		while (a.front != null || b.front != null) { // Så lenge en av køene har noder
			if (a.front == null) { // Hvis a køen er tom for noder..
				mergedQueue.enqueue(b.front.data);
				b.dequeue();
			} else if (b.front == null) {
				mergedQueue.enqueue(a.front.data);
				a.dequeue();
			}
		}
		return mergedQueue;
	}

	// TODO: Fjern alle metoder nedenfor etter testing
	public int getLength() {
		int nmb = 0;
		if (front != null) {
			Node current = front;
			while (current != null) {
				current = current.next;
				nmb++;
			}
		}
		return nmb;
	}

	public String toString() {
		if (front == null) {
			return "Køen er tom...\n";
		} else {
			String q = "Front -> ";
			;
			Node current = front;
			while (current != null) {
				q += current.toString();
				if (current.next != null) {
					q += "-->";
				}
				current = current.next;
			}
			q += "~~\n";
			return q;
		}
	}

	public void deleteNodes() {
		front = tail = null;
	}

} // END of CLASS
