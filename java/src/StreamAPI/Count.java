package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Count {

	public static void main(String[] args) {
				List<Integer> al=new ArrayList<Integer>();
				al.add(4);
				al.add(9);
				al.add(7);
				al.add(6);
				Long c=al.stream().filter(x->x%2==0).count();
				System.out.println("Filtered list"+c);
			}

		
}
