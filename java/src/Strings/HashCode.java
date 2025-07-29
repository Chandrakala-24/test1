package Strings;
import java.util.Scanner;
public class HashCode {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		int hash_code=str1.hashCode();
		System.out.println(hash_code);
		
	}

}
