package assignment;

import java.util.Scanner;

public class GetCodeThroughStrings {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	String input1=in.nextLine();
	GetCodeThroughStrings obj = new GetCodeThroughStrings();
    int result = obj.Code(input1);
    System.out.println("String Code: " + result);
    in.close();
	}

public int Code(String input1) {
	int len=0;
	for(int i=0;i<input1.length();i++) {
		if(input1.charAt(i)!=' ') {
			len++;
		}
	}
	while(len>9) {
		int sum=0;
		while(len>0) {
			sum+=len%10;
			len/=10;
		}
		len=sum;
	}
	return len;
}
}
	
			
	