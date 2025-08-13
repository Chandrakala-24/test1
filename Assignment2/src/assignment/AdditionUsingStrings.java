package assignment;

import java.util.Scanner;

public class AdditionUsingStrings {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String input1=in.nextLine();
		String input2=in.nextLine();
		AdditionUsingStrings obj = new AdditionUsingStrings();
        String result = obj.Add(input1,input2);
        System.out.println("String Code: " + result);

        in.close();
	}
	public String Add(String input1,String input2) {
	StringBuilder result=new StringBuilder();
    int i=input1.length()-1;
    int j=input2.length()-1;
    int carry=0;
    while(i>=0||j>=0||carry>0){
        int num1=(i>=0)?input1.charAt(i)-'0':0;
        int num2=(j>=0)?input2.charAt(j)-'0':0;
        int sum=num1+num2+carry;
        result.append(sum%10);
        carry=sum/10;
        i--;
        j--;
    }
    return result.reverse().toString();
    }
}




