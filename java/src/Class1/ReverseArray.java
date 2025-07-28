package Class1;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String args[]) {
		int[]arr= {25, 14, 56, 15, 36, 56};
		System.out.println("Original array:"+Arrays.toString(arr));
		for(int i=0;i<arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		}
		
		System.out.println("Original array : "+Arrays.toString(arr));
		}
	}