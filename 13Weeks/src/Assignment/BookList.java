package Assignment;

public class BookList {

	public static void main(String[] args) {
		Library lib = new Library();
		
		Book b1 = new Book("총, 균, 쇠", "재러드 다이아몬드");
		b1.setRentalFee(26820);
		
		Book b2 = new Book("퓨처 셀프", "밴저민 하디");
		b2.setRentalFee(16000);
		
		Book b3 = new Book("시간을 읽는 그림", "김선지");
		b3.setRentalFee(15000);
		
		Book b4 = new Book("이직로그", "이하얀");
		b4.setRentalFee(20000);
		
		Book b5 = new Book("위버멘쉬", "프리드리히 니체");
		b5.setRentalFee(39000);
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		lib.addBook(b5);
		
		lib.printAllBooks();
	}

}
