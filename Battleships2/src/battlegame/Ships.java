package battlegame;

public class Ships {
	private String name;
	private int length;
	private int shipID;
	private static int counter = 1;
	
	public Ships(String name, int length) {
		super();
		this.name = name;
		this.length = length;
		this.shipID = ++counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getShipID() {
		return shipID;
	}
	
	public void decreaseLength() {
		length--;
	}
	
	
}
