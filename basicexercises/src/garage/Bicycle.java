package garage;

public class Bicycle extends Vehicle {
	
	private boolean hasBasket;
	private boolean hasBell;
	
	public Bicycle(int ID, boolean hasEngine, int engineSize, int numOfWheels, boolean hasWindows, int numOfSeats, boolean hasBasket, boolean hasBell) {
		super(ID, hasEngine, engineSize, numOfWheels, hasWindows, numOfSeats);
		// TODO Auto-generated constructor stub
		this.hasBasket = hasBasket;
		this.hasBell = hasBell;
	}

	public boolean isHasBasket() {
		return hasBasket;
	}

	public void setHasBasket(boolean hasBasket) {
		this.hasBasket = hasBasket;
	}

	public boolean isHasBell() {
		return hasBell;
	}

	public void setHasBell(boolean hasBell) {
		this.hasBell = hasBell;
	}

	@Override
	public String toString() {
		return "Bicycle [ID= " + getID() + ", hasBasket=" + hasBasket + ", hasBell=" + hasBell + ", isHasEngine()=" + isHasEngine()
				+ ", getEngineSize()=" + getEngineSize() + ", getNumOfWheels()=" + getNumOfWheels()
				+ ", isHasWindows()=" + isHasWindows() + ", getNumOfSeats()=" + getNumOfSeats() + "]";
	}
	
	

}
