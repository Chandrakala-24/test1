package assignments;
import java.util.Scanner;
public class UpperLowerCase {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>='A' && c<='Z') {
			System.out.println(Character.toLowerCase(c));
		}
		if(c>='a' && c<='z') {
			System.out.println(Character.toUpperCase(c));
		}
		
		in.close();
	}

}
