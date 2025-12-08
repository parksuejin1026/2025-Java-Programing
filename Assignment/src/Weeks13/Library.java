package Weeks13;

import java.util.ArrayList;

public class Library {
	// Book 객체를 담을 ArrayList 생성
	private ArrayList<Book> books = new ArrayList<>(); // 배열 생성
	
	// 책을 리스트에 추가하고 "등록 완료" 메시지 출력
	public void addBook(Book book) { // Book 클래스의 데이터만 넣겠다
		books.add(book); 
		System.out.println("도서 등록 완료 : " +  book.getTitle());
	}
	
	// 등록된 도서 목록을 출력하는 메서드
	public void printAllBooks() {
		System.out.println("\n==== 등록된 도서 목록 (" + books.size() + "권) ====");
		
		for (int i = 0 ; i < books.size(); i++) {
			Book b = books.get(i);
			
			System.out.printf("%d. 제목 : %s, 저자 : %s, 대여료 : %d원\n", (i+1), b.getTitle(), 
								b.getAuthor(), b.getRentalFee());
		}
		System.out.println("===============================================");
	}
}
