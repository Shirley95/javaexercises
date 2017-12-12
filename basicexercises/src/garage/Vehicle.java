package garage;

public class Vehicle {

	private int ID;
	private boolean hasEngine;
	private int engineSize;
	private int numOfWheels;
	private boolean hasWindows;
	private int numOfSeats;
	
	public Vehicle(int ID, boolean hasEngine, int engineSize, int numOfWheels, boolean hasWindows, int numOfSeats) {
		super();
		this.ID = ID;
		this.hasEngine = hasEngine;
		this.engineSize = engineSize;
		this.numOfWheels = numOfWheels;
		this.hasWindows = hasWindows;
		this.numOfSeats = numOfSeats;
	}
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public boolean isHasWindows() {
		return hasWindows;
	}

	public void setHasWindows(boolean hasWindows) {
		this.hasWindows = hasWindows;
	}
	
	public int getNumOfSeats() {
		return numOfSeats;
	}
	
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	
	
	
}
