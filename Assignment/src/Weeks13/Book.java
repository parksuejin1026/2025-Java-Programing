package Weeks13;

public class Book {
	// 필드 생성
	private String title;
	private String author;
	private int rentalFee;
	
	// 제목과 저자를 초기화 하는 생성자 구현
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 대여료가 얼마인지 설정하는 메서드 작성
	public void setRentalFee(int rentalFee) {
		this.rentalFee = rentalFee;
	}
	
	// 제목을 출력하기 위한 Getter 메서드
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getRentalFee() {
		return rentalFee;
	}
}
