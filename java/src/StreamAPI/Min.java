package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Min {

	public static void main(String[] args) {
								List<Integer> al=new ArrayList<Integer>();
								al.add(4);
								al.add(9);
								al.add(7);
								al.add(6);
								int c=al.stream().min((x,y)->x>y?1:-1).get();
								System.out.println("Filtered list"+c);
							}

						
				}


		
