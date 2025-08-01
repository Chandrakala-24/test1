package StreamAPI;
import java.util.List;
import java.util.ArrayList;

public class Map {

	public static void main(String[] args) {
				List<String> al=new ArrayList<String>();
				al.add("User");
				al.add("Computer");
				al.add("Admin");
				al.add("Animal");
				al.stream().map(String::toUpperCase).forEach(System.out::println);
		


		}


	}


