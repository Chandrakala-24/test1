package ArrayList.java;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Shuffle {
	public static void main(String args[]) {
	List<String> L1=new ArrayList<String>();
	L1.add("Black");
	L1.add("White");
	L1.add("Orange");
	L1.add("Beige");
	System.out.println(L1);
	Collections.shuffle(L1);
	System.out.println(L1);
	}
}
