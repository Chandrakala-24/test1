package ArrayList.java;
import java.util.*;
public class Copy {
	public static void main(String args[]) {
		List<String> L1=new ArrayList<String>();
		L1.add("Black");
		L1.add("White");
		L1.add("Orange");
		L1.add("Beige");
		System.out.println("List1:"+L1);
		List<String> L2=new ArrayList<String>();
		L2.add("Apple");
		L2.add("Orchid");
		L2.add("Kiwi");
		L2.add("Mango");
		System.out.println("List2:"+L2);
		Collections.copy(L1, L2);
		System.out.println("Copy L1 to L2");
		System.out.println("L1:"+L1);
		System.out.println("L2:"+L2);
	}

}
