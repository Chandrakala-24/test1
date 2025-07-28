package Class1;

import java.util.Arrays;

public class AddElement {
	public static void main(String args[]) {
	 int[] arr= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; 
	 System.out.println("Original array:"+Arrays.toString(arr));
	 int Index=4;
	 int element=45;
	 for(int i=arr.length-1;i>Index;i--) {
		 arr[i]=arr[i-1];
	 }
	 arr[Index]=element;
	 System.out.println("New array:"+Arrays.toString(arr));
	}
	 

}
