package Library;

import java.util.ArrayList;

/**
 * 도서관 서비스의 핵심 비즈니스 기능에 대한 규격(Contract)을 정의하는 인터페이스입니다.
 * 이 인터페이스를 구현하는 클래스는 정의된 모든 메서드를 구현해야 합니다.
 */
public interface LibraryServiceContract {
    
    // 1. 도서 등록 기능
    String registerBook(String title, String author, String isbn);
    
    // 2. 도서 대여 기능
    String rentBook(String isbn);
    
    // 3. 도서 반납 기능
    String returnBook(String isbn); 
    
    // 4. 전체 목록 조회
    ArrayList<Book> getAllBooks();
}