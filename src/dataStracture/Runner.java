package dataStracture;

public class Runner {

	public static void main(String[] args) {
		
//		DynamicArray<String> DArray = new DynamicArray<String>();
//		
//		DArray.add("Hello");
//		DArray.add("Hello");
//		DArray.add("Hello");
//		DArray.add("Hello");
//		System.out.println(DArray.getSize());
//		
//		String Word = "Hello";
//		String[] result = Word.split(" ");
//		System.out.println(result);
		
//		LinkedList lList = new LinkedList(new Node<Integer>(12,null));
//		lList.add(new Node<String>("Hi",null));
//		Node<String> a2 = new Node<String>("Welcome",null); 
//		
//		lList.Display();
		
		// 3- Stack
		
//		Stack<String> StackArray = new Stack<String>(5);
//		StackArray.push("H");
//		StackArray.push("He");
//		StackArray.push("Hel");
//		StackArray.push("Hell");
//		StackArray.push("Hello");
//
//		System.out.println(StackArray.pop());
//		
//		System.out.println(StackArray.Size);
//		StackArray.DisplayStack();
		
		
		
//		4 - Queue:
		
		QueueArray<Integer> Que = new QueueArray<Integer>(4);
		Que.Queue(1);
		Que.Queue(2);
		Que.Queue(3);
		Que.Queue(4);
		Que.deQueue();
		Que.deQueue();
		Que.deQueue();

		Que.DisplayQueue();
		

}
}
