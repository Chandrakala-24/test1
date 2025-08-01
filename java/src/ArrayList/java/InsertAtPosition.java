package ArrayList.java;

import java.util.ArrayList;
import java.util.List;

public class InsertAtPosition {
	public static void main(String args[]) {
		List<String> vehicle=new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Jeep");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		System.out.println(vehicle);
		vehicle.add(2,"Scooty");
		vehicle.add(5,"Aeroplane");
		System.out.println(vehicle);
	}


}
