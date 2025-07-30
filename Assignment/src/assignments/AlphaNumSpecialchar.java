package assignments;
import java.util.Scanner;
public class AlphaNumSpecialchar {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if((c>='A' && c<='Z')|| (c>='a' && c<='z')) {
			System.out.println("Alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("Number");
		}
		else {
			System.out.println("Special character");
		}
		in.close();
	}

}
