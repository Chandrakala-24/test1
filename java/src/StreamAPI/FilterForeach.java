package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterForeach {
	public static void main(String args[])
	{
		List<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(9);
		al.add(7);
		al.add(6);
		al.stream().filter(x->x%2==0).forEach(x->System.out.println(x+" "));
	}
}
