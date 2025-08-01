package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterCollectString {
	public static void main(String args[])
	{
		List<String> al=new ArrayList<String>();
		al.add("User");
		al.add("Computer");
		al.add("Admin");
		al.add("Animal");
		List<String> li=al.stream().filter(x->x.contains("e")).collect(Collectors.toList());
		System.out.println("Original list"+al);
		System.out.println("Filtered list"+li);
	}


}
