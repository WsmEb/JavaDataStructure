package dataStracture;

//public class Node <T> {
//	T value;
//	Node Next;
//	
//	
//	public Node(T value,Node Next) {
//		this.value = value;
//		this.Next = Next;
//	}
//
//}

public class Node<T> {
	
	T value;
	Node next;
	
	public Node(T value,Node next) {
		this.value = value;
		this.next = next;
	}
}
