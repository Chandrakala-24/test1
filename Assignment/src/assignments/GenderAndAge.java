package assignments;
import java.util.Scanner;
public class GenderAndAge {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Gender:");
		String Gender=in.nextLine();
		System.out.println("Enter the num:");
		int Age=in.nextInt();
		if(Gender.equalsIgnoreCase("Female")&& (Age>=1 && Age<=58)) {
			System.out.println("8.2%");
		}
		if(Gender.equalsIgnoreCase("Female")&& (Age>=59 && Age<=100)) {
			System.out.println("9.2%");
		}
		if(Gender.equalsIgnoreCase("Male")&& (Age>=1 && Age<=58)){
			System.out.println("8.4%");
		}
		if(Gender.equalsIgnoreCase("Male") && (Age>=59 && Age<=100)) {
			System.out.println("10.5%");
		}
		
		in.close();
	}

}
