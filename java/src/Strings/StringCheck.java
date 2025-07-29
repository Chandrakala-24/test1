package Strings;

import java.util.Scanner;

public class StringCheck {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();
		String str3=in.nextLine();
		boolean equal1=(str1)==(str2);
		boolean equal2=str1.equals(str3);
		System.out.println(equal1);
		System.out.println(equal2);	
	}

}
