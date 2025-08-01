package ArrayList.java;

import java.util.ArrayList;
import java.util.List;

public class Search {
	public static void main(String args[]) {
		List<String> vehicle=new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Jeep");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		System.out.println(vehicle);
		if(vehicle.contains("Aeroplane")) {
			System.out.println("Vehicle found");
		}
		else {
			System.out.println("Vehicle not found");
		}
	}


}
