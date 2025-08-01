package ArrayList.java;

import java.util.ArrayList;
import java.util.List;

public class ElementFromIndex {
	public static void main(String args[]) {
		List<String> vehicle=new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Jeep");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		System.out.println(vehicle);
		String element=vehicle.get(0);
		System.out.println("First element:"+element);
	    element=vehicle.get(3);
	    System.out.println("Fourth element:"+element);
		
	}


}
