package library;

public class Journal extends Item {
	
	private int volumeNumber;


	public Journal(String name, String author, int yearOfPublished, boolean hasItem, int ID, int volumeNumber) {
		super(name, author, yearOfPublished, hasItem, ID);
		this.volumeNumber = volumeNumber;
	}

	public int getVolumeNumber() {
		return volumeNumber;
	}

	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}

	@Override
	public String toString() {
		return "Journal [volumeNumber=" + volumeNumber + ", getName()=" + getName() + ", getAuthor()=" + getAuthor()
				+ ", getYearOfPublished()=" + getYearOfPublished() + ", isHasItem()=" + isHasItem() + ", getID()="
				+ getID() + "]";
	}

	
	

}
