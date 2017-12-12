package garage;

public class Car extends Vehicle {
	
	private String make;
	private int yearModel;

	public Car(int ID, boolean hasEngine, int engineSize, int numOfWheels, boolean hasWindows, int numOfSeats, String make, int yearModel) {
		super(ID, hasEngine, engineSize, numOfWheels, hasWindows, numOfSeats); // calling Vehicle constructor
		// TODO Auto-generated constructor stub
		// no need to instantiate methods like hasEngine --> it is done by the parent class
		this.make = make;
		this.yearModel = yearModel;
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	@Override
	public String toString() {
		return "Car [ID= " + getID() + ", make=" + make + ", yearModel=" + yearModel + ", isHasEngine()=" + isHasEngine()
				+ ", getEngineSize()=" + getEngineSize() + ", getNumOfWheels()=" + getNumOfWheels()
				+ ", isHasWindows()=" + isHasWindows() + ", getNumOfSeats()=" + getNumOfSeats() + "]";
	}
	
	
}
