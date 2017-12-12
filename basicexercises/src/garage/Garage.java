package garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleListType = new ArrayList<Vehicle>();
	
	
	// add vehicle method
	public void addVehicle(Vehicle v)
	{
		vehicleListType.add(v);
	}
	
	public void calculateBill()
	{
		for (Vehicle a : vehicleListType)
		{
			if (a instanceof Car)
			{
				System.out.println("Bill is £2000");
			}
			else if (a instanceof Motorbike)
			{
				System.out.println("Bill is £1000");
			}
			else if (a instanceof Bicycle)
			{
				System.out.println("Bill is £100");
			}
		}
	}
	
	public void removeVehicle(Vehicle v, int ID) // passing the vehicle
	{
		ArrayList<Vehicle> newList = new ArrayList<Vehicle>();
		
		for (Vehicle a : vehicleListType) // for a in range of vehicleListType
		{
			boolean isIdOk = a.getID() == ID;
			if (a instanceof Car == v instanceof Car && isIdOk)
			{
				
			}
			else if (a instanceof Motorbike == v instanceof Motorbike && isIdOk)
			{
				
			}
			else if (a instanceof Bicycle == v instanceof Bicycle && isIdOk)
			{
				
			}
			else 
			{
				newList.add(a);
			}
		}
		vehicleListType = newList;
	}
	
	public ArrayList<Vehicle> getVehicleListType()
	{
		return vehicleListType;
	}
	
	
	
}
