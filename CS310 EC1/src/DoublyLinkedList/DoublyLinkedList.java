package DoublyLinkedList;

public class DoublyLinkedList extends DataClass {

	private Node head, tail = null;
	private int nodeSize = 0;

	public void insertAtHead(int data, String name) {
		Node newNode = new Node(data, name);
		if (nodeSize == 0) {
			head = newNode;
			tail = newNode;
			newNode.previous = head;
			newNode.next = head;
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
			head.previous = tail;
		}
		nodeSize++;
	}

	public void insertAtTail(int data, String name) {
		Node newNode = new Node(data, name);
		tail.next = newNode;
		tail = newNode;
		newNode = tail;
		tail.next = head;
		head.previous = tail;
		nodeSize++;
	}

	public void deleteAtHead() {
		head = head.next;
		tail.next = head;
		head.previous = tail;
		nodeSize--;
	}

	public void deleteAtTail() {
		head = tail.next.next;
		tail = head.next;
		head = head.next.next;
		head = head.next;
		tail.next = head;
		head.previous = tail;
		nodeSize--;
	}
	

	public int length() {
		return nodeSize;
	}

	public void displayList() {
		Node current = head;
		if (nodeSize == 0) {
			System.out.println("The list is empty...");
			return;
		}
		System.out.println("List: ");
		do {
			System.out.println(current.data + " " + current.name + " ");
			current = current.next;
		} while (current != head);
	}
}
