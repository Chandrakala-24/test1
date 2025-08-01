package ArrayList.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String args[]) {
		List<String> vehicle=new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Jeep");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		System.out.println(vehicle);
		Collections.sort(vehicle);
		System.out.println(vehicle);
	}


}
