package Weeks13;

public class BookList {

	public static void main(String[] args) {
		// lib 객체 생성
		Library lib = new Library();
		
		// 책 5권 데이터 생성 (제목, 저자 초기화) 및 대여료 설정
		Book b1 = new Book("총, 균, 쇠", "재러드 다이아몬드");
		b1.setRentalFee(26820);
		
		Book b2 = new Book("퓨처 셀프", "벤저민하디");
		b2.setRentalFee(19800);
		
		Book b3 = new Book("시간을 읽는 그림", "김선지");
		b3.setRentalFee(18900);
		
		Book b4 = new Book("이직로그", "이하얀");
		b4.setRentalFee(16000);
		
		Book b5 = new Book("위버멘쉬", "프리드리히 니체");
		b5.setRentalFee(18000);
		
		// Library에 책 저장
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		lib.addBook(b5);
		
		// 저장한 책 출력
		
		lib.printAllBooks();
		
	}

}
