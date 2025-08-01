package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Reduce {
			public static void main(String args[])
			{
				List<Integer> al=new ArrayList<Integer>();
				al.add(4);
				al.add(9);
				al.add(7);
				al.add(6);
				int sum=al.stream().reduce(0, Integer::sum);
				System.out.println(sum);
			}
		}

	