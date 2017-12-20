package library;

public abstract class Item {
	private String name;
	private String author;
	private int yearOfPublished;
	private boolean hasItem;
	private int ID;
	
	public Item(String name, String author, int yearOfPublished, boolean hasItem, int ID) {
		super();
		this.name = name;
		this.author = author;
		this.yearOfPublished = yearOfPublished;
		this.hasItem = hasItem;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublished() {
		return yearOfPublished;
	}

	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}

	public boolean isHasItem() {
		return hasItem;
	}

	public void setHasItem(boolean hasItem) {
		this.hasItem = hasItem;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
