package Assignment;

public class Book {
	String title;
	String author;
	int rentalFee;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void setRentalFee(int rentalFee) {
		this.rentalFee = rentalFee;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return title;
	}
	
	public int getRentalFee() {
		return rentalFee;
	}
}
