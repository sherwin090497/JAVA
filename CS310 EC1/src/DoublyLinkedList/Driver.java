package DoublyLinkedList;

public class Driver {
	public static void main(String[] args) {
		  
		DoublyLinkedList list = new DoublyLinkedList();
		System.out.println("\nInserting Elements at Head");
		list.insertAtHead(1,"StringOne"); 
		list.insertAtHead(2,"StringTwo");
		list.insertAtHead(3,"StringThree");
		list.displayList();
		System.out.println("Length: " + list.length());
		
		System.out.println("\nInserting Elements at Tail");
		list.insertAtTail(4,"StringFour"); 
		list.insertAtTail(5,"StringFive"); 
		list.insertAtTail(6,"StringSix"); 
		list.displayList();
		System.out.println("Length: " + list.length());	
		
		System.out.println("\nDeleting Elements at Head");
		list.deleteAtHead();
		list.deleteAtHead();
		list.displayList();
		System.out.println("Length: " + list.length());	
		
		System.out.println("\nDeleting Elements at Tail");
		list.deleteAtTail();
		list.displayList(); 
		System.out.println("Length: " + list.length());
		 
		}
}
