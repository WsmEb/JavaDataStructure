package dataStracture;

public class Stack<T> {
	
	int Size;
	Object[] StackArray;
	int top;

	public Stack(int Size) {
		this.Size = Size;
		StackArray = new Object[this.Size];
		this.top = -1;
	}
	
	public void push(T item) {
		if (ISfull() ) return ;
		++this.top;
		StackArray[this.top] = item;
	}
	
	private boolean ISfull() {
		return (this.Size == this.top + 1);
	}
	
	public T pop() {
		if (ISempty()) return null;
		T item = (T) StackArray[this.top];
		--this.top;
		return item;
	}
	
	private boolean ISempty()
	{
		return (this.top == -1 );
	}
	
	public void DisplayStack()
	{
		for ( int i = this.top;i>-1;i--)
		{
			System.out.println(this.StackArray[i]);
			System.out.println("----");
		}
	}

}
