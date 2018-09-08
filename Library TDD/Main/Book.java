package ConductQA.Test;

public class Book extends Items {
	private int BookId;
	private String name;
	private String genre;
	
	public Book (int BookId, String Name, String Genre) {
		this.BookId = BookId;
		this.name = Name;
		this.genre = Genre;
		
		
		
	}
	
	public int setID() {
		
		return this.BookId;
		
	}
	
	public int getBookId() {
		
		
		return BookId;
		
	}
	
	public String setName() {
		return this.name;
		
	}
	
	public String getName() {
		
	return name;
	
	}
	
	public String setGenre() {
		
	return this.genre;	
		
	}
	
	public String getGenre() {
		
	return genre;	
		
	}
	
	
	public String out() {
		
	return BookId + name + genre;	
	}



}
