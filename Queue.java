/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface {
	
	private Node head;
	
	public Queue() {
		head = null;
	}
	
	public void enqueue(String record) {
		Node newNode = new Node();
		newNode.record = record;
		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
		}
		
		// TODO Auto-generated method stub
		
	}

	public String dequeue() {
		String temp = head.record;
		head.record = null;
		head = head.next;
		return temp;
		
	}

	public void printQueue() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		
		
	}

	// Your implementation here
	
}
