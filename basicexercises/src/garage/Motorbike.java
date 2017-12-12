package garage;

public class Motorbike extends Vehicle {
	
	private int yearModel;

	public Motorbike(int ID, boolean hasEngine, int engineSize, int numOfWheels, boolean hasWindows, int numOfSeats, int yearModel) {
		super(ID, hasEngine, engineSize, numOfWheels, hasWindows, numOfSeats);
		// TODO Auto-generated constructor stub
		this.yearModel = yearModel;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	@Override
	public String toString() {
		return "Motorbike [ID= " + getID() + ", yearModel=" + yearModel + ", isHasEngine()=" + isHasEngine() + ", getEngineSize()="
				+ getEngineSize() + ", getNumOfWheels()=" + getNumOfWheels() + ", isHasWindows()=" + isHasWindows()
				+ ", getNumOfSeats()=" + getNumOfSeats() + "]";
	}

	
	

}
