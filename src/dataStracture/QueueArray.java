package dataStracture;

public class QueueArray<T> {
	
	int Size;
	Object[] Queue;
	int Front;
	int Rear;
	

	public QueueArray(int Size) {
		this.Size = Size;
		Queue = new Object[this.Size];
		this.Front = -1;
		this.Rear = -1;
	}
	
	public void Queue(T item) 
	{
		
		if (isFull()) {
			this.Rear = -1;
			System.out.println("Queue is Full !!");
		};
		++this.Rear;
		Queue[this.Rear] = item;
		
		if (this.Front == -1) 
		{
			++this.Front;
		}
	}
	
	private boolean isFull()
	{
		return (this.Size == (this.Rear + 1));
	}
	
	public T deQueue()
	{
		if (isEmpty())
			{
			this.Front = -1 ;
			System.out.println("Queue is Empty !!");
			return null;
			};
		T item = (T)  Queue[this.Front];
		++this.Front;
		return item;
		
	}
	
	private boolean isEmpty()
	{
		return (this.Front == -1 || this.Front > this.Rear);
	}
	
	public void DisplayQueue() 
	{
		boolean Case = this.Front == -1 && this.Rear == -1;
		if (this.Front-1 == this.Rear || Case  )
		{
			System.out.print("there is Nothing in the Queue");
		}
		else 
		{
			DisplayQueueLoop();
		}

	}
	
	private void DisplayQueueLoop()
	{
		for ( int i = this.Front;i<(this.Front+(this.Rear+1 - this.Front));i++)
		{
			System.out.println("--------");
			System.out.println(Queue[i]);

		}
	}

}
