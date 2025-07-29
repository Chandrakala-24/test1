package Strings;

import java.util.Scanner;

public class StsrtString {
	public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			String str1=in.nextLine();
			String str2=in.nextLine();
			String start=in.nextLine();
			boolean start1=str1.startsWith(start);
			boolean start2=str2.startsWith(start);
			System.out.println(start1);
			System.out.println(start2);	
	}
}
