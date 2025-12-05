package Assignment;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		
		System.out.println("도서 등록 완료 : " + book.getTitle());
	}
	
	public void printAllBooks() {
		System.out.println("\n ===== 등록된 도서 목록 (" + books.size() + "권) =====");
		
		for( int i = 0 ; i < books.size() ; i++ ) {
			Book b = books.get(i);
			System.out.printf("%d. 제목 : %s, 저자 : %s, 대여료 : %d원\n", (i+1), b.getTitle(), b.getAuthor(), b.getRentalFee());
		}
		System.out.println("================================================");
	}
}
