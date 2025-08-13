package assignment;

import java.util.Scanner;

class Result{
	public int output1;
	public int output2;
}
class Solution{
	public Result findOriginalFirstAndSum(int[] input1,int input2) {
		int[] originalArray=new int[input2];
		originalArray[input2-1]=input1[input2-1];
		for(int i=input2-2;i>=0;i--) {
			originalArray[i]=input1[i]-originalArray[i+1];
		}
		int sumOfOriginalArray=0;
		for(int num:originalArray) {
			sumOfOriginalArray+=num;
		}
		Result result=new Result();
		result.output1=originalArray[0];
		result.output2=sumOfOriginalArray;
		return result;
	}
}
public class SimpleEncodedArray{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] encodedArray=new int[n];
		for(int i=0;i<n;i++) {
			encodedArray[i]=in.nextInt();
		}
		Solution sol=new Solution();
		Result res=sol.findOriginalFirstAndSum(encodedArray,n);
		System.out.println(res.output1);
		System.out.println(res.output2);
		in.close();
	}
}

	
		
