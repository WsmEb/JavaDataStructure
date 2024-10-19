package dataStracture;
import java.util.ArrayList;
public class SortedMatchingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"a","b","c","f","j"};
		String[] arr2 = {"a","a","a","b","c"};
		System.out.println(SortedMatchingProblem(arr1,arr2));
		


	}
	
	 static ArrayList<String> SortedMatchingProblem(String[] arr1,String[] arr2) {
		 
		 ArrayList<String> MatchedChar = new ArrayList<String>();
		 int arr1Length = arr1.length;
		 int arr2Length = arr2.length;
		 
		 int i = 0;
		 int j = 0;
		 while( i < arr1Length && j < arr2Length ) {
			 if (arr1[i].compareToIgnoreCase(arr2[j]) == 0 && !MatchedChar.contains(arr1[i])) {
				 MatchedChar.add(arr1[i]);
				 i++;
				 j++;
			 }
			 
			 else if(arr1[i].compareToIgnoreCase(arr2[j]) < 0) {
				i++; 
			 }
			 else {
				 j++;
			 }
		 }
		 return MatchedChar;
	}
	


}
