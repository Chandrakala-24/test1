package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterCollect1 {
		public static void main(String args[])
		{
			List<Integer> al=new ArrayList<Integer>();
			al.add(-4);
			al.add(9);
			al.add(-7);
			al.add(6);
			List<Integer> li=al.stream().filter(x->x<0).collect(Collectors.toList());
			System.out.println("Original list"+al);
			System.out.println("Filtered list"+li);
		}

	}



