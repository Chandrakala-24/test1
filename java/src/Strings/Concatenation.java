package Strings;
import java.util.Scanner;
public class Concatenation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("String1:");
		String str1=in.nextLine();
		System.out.println("String2:");
		String str2=in.nextLine();
		String str3=str1.concat(str2);
		System.out.println("Concatenated string:"+str3);
	}

}
