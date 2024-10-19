package dataStracture;

//public class LinkedList {
//
//	Node head;
//	public LinkedList(Node head) {
//		this.head = head;
//	}
//	
//	public void add(Node newNode) {
//		newNode.Next = head;
//		head = newNode;
//	}
//	
//	public void Delete() {
//		head = head.Next;
//	}
//	
//	public void Display() {
//		Node n = head;
//		while(n != null) {
//			System.out.print(n.value + "\t");
//			n = n.Next;
//		}
//	}
//
//}

public class LinkedList {
	
	Node head;
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void add(Node newNode) {
		newNode.next = head;
		head = newNode;		
	}
	
	public void Delete() {
		this.head = head.next;
	}
	
	public void Display() {
		Node n = head;
		while( n != null) {
			System.out.println(n.value);
			n = n.next;
		}
	}
}
