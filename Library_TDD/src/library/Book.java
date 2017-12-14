package library;

public class Book extends Item {
	
	private String genre;
	private String bookType; // hard-back/paperback
	

	public Book(String name, String author, int yearOfPublished, boolean hasItem, int ID, String genre,
			String bookType) {
		super(name, author, yearOfPublished, hasItem, ID);
		this.genre = genre;
		this.bookType = bookType;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", bookType=" + bookType + ", getName()=" + getName() + ", getAuthor()="
				+ getAuthor() + ", getYearOfPublished()=" + getYearOfPublished() + ", isHasItem()=" + isHasItem()
				+ ", getID()=" + getID() + "]";
	}


	
	

}
