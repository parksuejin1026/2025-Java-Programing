package Library;

import java.util.ArrayList;

/**
 * 도서관 서비스의 핵심 비즈니스 기능에 대한 규격(Contract)을 정의하는 인터페이스입니다.
 * 구현체는 정의된 모든 메서드를 구현하고 BookException을 처리해야 합니다.
 */
public interface LibraryServiceContract {
    
    // String 반환 대신 void로 변경하고, throws BookException을 선언
    void registerBook(String title, String author, String isbn) throws BookException;
    
    // String 반환 대신 void로 변경하고, throws BookException을 선언
    void rentBook(String isbn) throws BookException;
    
    // String 반환 대신 void로 변경하고, throws BookException을 선언
    void returnBook(String isbn) throws BookException;
    
    ArrayList<Book> getAllBooks();
}