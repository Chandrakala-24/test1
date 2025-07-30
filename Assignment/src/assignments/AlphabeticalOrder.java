package assignments;
import java.util.Scanner;
public class AlphabeticalOrder {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		char ch1 = in.next().charAt(0);
		char ch2=in.next().charAt(0);
		if(ch1<ch2) {
			System.out.println(ch1+","+ch2);
		}
		else {
			System.out.println(ch2+","+ch1);
		}
		in.close();

	}

}
