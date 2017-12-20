package garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleListType = new ArrayList<>();
	
	
	// add vehicle method
	public void addVehicle(Vehicle v)
	{
		vehicleListType.add(v);
	}
	
	public String calculateBill()
	{
		String d = "";
		for (Vehicle a : vehicleListType)
		{
			
			if (a instanceof Car)
			{
				d += "Bill is £2000";
			}
			else if (a instanceof Motorbike)
			{
				d += "Bill is £1000";
			}
			else if (a instanceof Bicycle)
			{
				d += "Bill is £100";
			}
		}
		return d;
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
