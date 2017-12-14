package library;

public class governmentDocuments extends Item {
	private boolean isConfidential;


	public governmentDocuments(String name, String author, int yearOfPublished, boolean hasItem, int ID,
			boolean isConfidential) {
		super(name, author, yearOfPublished, hasItem, ID);
		this.isConfidential = isConfidential;
	}

	public boolean isConfidential() {
		return isConfidential;
	}

	public void setConfidential(boolean isConfidential) {
		this.isConfidential = isConfidential;
	}

	@Override
	public String toString() {
		return "governmentDocuments [isConfidential=" + isConfidential + ", getName()=" + getName() + ", getAuthor()="
				+ getAuthor() + ", getYearOfPublished()=" + getYearOfPublished() + ", isHasItem()=" + isHasItem()
				+ ", getID()=" + getID() + "]";
	}

	

}
