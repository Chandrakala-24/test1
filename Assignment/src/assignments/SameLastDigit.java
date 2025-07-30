package assignments;
import java.util.Scanner;
public class SameLastDigit {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two nonnegative numbers");
		int num1=in .nextInt();
		int num2=in.nextInt();
		if(num1%10==num2%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		in.close();
		
	}

}
