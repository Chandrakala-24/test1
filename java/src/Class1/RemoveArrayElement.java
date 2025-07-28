package Class1;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveArrayElement {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Original array:"+Arrays.toString(arr));
		int remove=sc.nextInt();
		for(int i=remove;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("After element removal"+Arrays.toString(arr));
	}

}

