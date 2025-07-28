package Class1;

import java.util.Arrays;

public class Addarray {
	public static void main(String args[]) {
		int []arr1= {5,6,7,8,9};
		int []arr2= {23,46,12,36,47};
		int []add=new int[5];
		int i=0;
		while(i<arr1.length) {
			add[i]=arr1[i]+arr2[i];
			i++;	
		}
		System.out.println(Arrays.toString(add));
		for(int j=0;j<arr1.length;j++) {
			for(int k=0;k<arr1.length;k++) {
				if(add[j]<add[k]) {
					int temp=add[j];
					add[j]=add[k];
					add[k]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(add));
		for(int j=0;j<arr1.length;j++) {
			for(int k=0;k<arr1.length;k++) {
				if(add[j]>add[k]) {
					int temp=add[j];
					add[j]=add[k];
					add[k]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(add));
		
	}
	}