package ClassObject;

public class AddLastDigits {
	public static int addLastDigits(int input1, int input2) {
		input1=Math.abs(input1);
		input2=Math.abs(input2);
		
		int last1=input1%10;
		int last2=input2%10;
		return last1+last2;
	}
	public static void main(String args[]) {
	System.out.println(addLastDigits(267,154));
	System.out.println(addLastDigits(-267,154));
	System.out.println(addLastDigits(267,-154));
	System.out.println(addLastDigits(-267,-154));
	}
}
