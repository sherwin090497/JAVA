package DoublyLinkedList;

public class DataClass {
	class Node { 
		int data; 
		String name; 
		Node previous; 
		Node next;

		public Node(int data, String name) { 
			this.data = data;
			this.name = name;
		}
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
