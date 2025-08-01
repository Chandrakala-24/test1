package ArrayList.java;

import java.util.ArrayList;
import java.util.List;

public class UpdateArraylist {
	public static void main(String args[]) {
		List<String> vehicle=new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Jeep");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		System.out.println(vehicle);
		vehicle.set(2,"Lorry");
		System.out.println(vehicle);
	}


}
