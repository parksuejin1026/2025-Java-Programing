package Library;

import java.util.ArrayList;

public interface LibraryServiceContract {
    
    // 도서 등록 메서드, throws BookException을 선언
    void registerBook(String title, String author, String isbn) throws BookException;
    
    // 도서 대여 메서드, throws BookException을 선언
    void rentBook(String isbn) throws BookException;
    
    // 도서 반납 메서드, throws BookException을 선언
    void returnBook(String isbn) throws BookException;
    
    // 모든 도서 조회 Getter 메서드
    ArrayList<Book> getAllBooks();
}