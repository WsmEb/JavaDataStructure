package dataStracture;

public class LineareAndBinarySearch {
	
	public static  int LinearSearch(int[] arr,int Val) {
		for (int i = 0;i< arr.length;i++) {
			if (arr[i] == Val) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27};
		int invoker = BinaryJumpSearch(arr,13);
		System.out.println(invoker);

	}
	
	public static int BinaryJumpSearch(int[] arr,int Val) {
		int hight = arr.length - 1;
		int low = 0;
		int Mid = (low + hight) / 2;
		int result = -1;
		int Jumper = Val - Mid;
		int JumpCast; 
		
		
		try {
			
			do {
				if (arr[Mid] == Val) {
					result = Mid;
					return result;
					

				}
				
				else if(arr[Mid] > Val) {
					Mid -= (-Jumper) + 1;

				}
				else if(arr[Mid] < Val) {
					JumpCast = Jumper < 0 ? -Jumper: Jumper;
//					Mid += JumpCast - 1 ;
				}

			}while(arr[Mid] == Val);
			
			return result;
			
			
		}catch(ArrayIndexOutOfBoundsException Error) {
			return result;
		}
	}
	


}
