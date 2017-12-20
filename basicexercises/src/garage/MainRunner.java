package garage;

import java.util.Arrays;

public class MainRunner {
	public static void main(String[] args) 
	{
		// create object from the Garage class
		Garage garage1 = new Garage();
		Vehicle honda = new Car(123, true, 2000, 4, true, 5, "honda", 2017);
		Vehicle bmw = new Motorbike(456, true, 150, 2, false, 1, 1958);
		Vehicle mountainbike = new Bicycle(789, false, 0, 2, false, 2, true, true);	
		
		// adding vehicles to list in garage1 object using the addVehicle method in Garage class
		garage1.addVehicle(honda);
		garage1.addVehicle(bmw);
		garage1.addVehicle(mountainbike);
		
		garage1.calculateBill();
		garage1.removeVehicle(mountainbike, 789);
		System.out.println(Arrays.toString(garage1.getVehicleListType().toArray()));
		garage1.removeVehicle(honda, 123);
		System.out.println(Arrays.toString(garage1.getVehicleListType().toArray()));
		garage1.removeVehicle(mountainbike, 900);
		System.out.println(Arrays.toString(garage1.getVehicleListType().toArray()));
		
		garage1.getVehicleListType().clear();
		
		
		
		
	}
}
