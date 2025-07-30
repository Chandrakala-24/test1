package assignments;
import java.util.Scanner;
public class ColourCode {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		char colour=in.next().charAt(0);
	    switch(colour){
	    case 'R':System.out.println("Red");
	             break;
	    case 'B':System.out.println("Blue");
	             break;
	    case 'G':System.out.println("Green");
	    	     break;
	    case 'O':System.out.println("Orange");
	             break;
	    case 'Y':System.out.println("Yellow");
	             break;
	    case 'W':System.out.println("White");
	             break;
	    default:
	    	System.out.println("Invalid Code");
	    	
	    }
	    in.close();
	}

}
