package dataStracture;

import java.util.Arrays;

public class DynamicArray<T> {
	

	int Size=0;
	Object[] Arr;
	private int Length;
	
	public DynamicArray() {
		Arr = new Object[1];

		
	}
	
	public void add(T element) {
		checkCapacity(Size+1);
		Arr[Size++] = element;
	}
	
	public int getSize() {
		return Arr.length;
	}
	
	private void checkCapacity(int Capacity) {
		Length = Arr.length;
		if (Capacity > Length) {
			Length += (Capacity - Length);
			Arr = Arrays.copyOf(Arr, Length);
		}
	}
}
