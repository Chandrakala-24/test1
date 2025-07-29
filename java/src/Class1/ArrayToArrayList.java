package Class1;
import java.util.ArrayList;
public class ArrayToArrayList { 
		public static void main(String[] args) {
	        String[] myArray = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
	        ArrayList<String> list = new ArrayList<>();

	        for (int i = 0; i < myArray.length; i++) {
	            list.add(myArray[i]);  // Add each element using index
	        }

	        System.out.println(list);
	    }

}
