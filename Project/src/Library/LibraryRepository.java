package Library;

import java.util.ArrayList;

/**
 * 도서 데이터를 저장하고 관리하는 저장소(Repository) 클래스입니다.
 * 데이터 접근과 관련된 책임만 담당하며, ISBN과 제목 모두로 검색할 수 있습니다.
 */
public class LibraryRepository { 
	// Book 클래스의 객체를 저장하는 배열 생성
    private ArrayList<Book> books = new ArrayList<>(); // 도서 목록을 저장하는 배열 생성
    
    public LibraryRepository() { // 제목, 저자, 도서 ID, 도서 대여 상태(false면 보유 중)
        books.add(new Book("총, 균, 쇠", "재레드 다이아몬드", "1001", false)); 
        books.add(new Book("객체지향의 사실과 오해", "조영호", "1002", false));
    }
    
    // 도서 저장
    public void save(Book book) {
        books.add(book); // 배열에 도서 저장 제목, 저자, 도서 ID, 도서 대여 상태
    }
    
    /**
     * ISBN(ID)을 기준으로 도서를 찾아 반환합니다.
     */
    public Book findByIsbn(String isbn) {
        for (Book book : books) { // books 배열 객체 전부 확인
            if (book.getIsbn().equals(isbn)) { // getter 함수로 도서 ID가 있는 지 확인 
                return book; // 있다면 객체 반환
            }
        }
        return null;
    }
    
    /**
     * [⭐ 새로 추가된 기능] 도서 제목을 기준으로 도서를 찾아 반환합니다.
     * (발표 시연 편의를 위해 제목이 완전히 일치하는 첫 번째 도서를 반환합니다.)
     */
    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) { // 영어 제목의 대소문자를 무시하기 위해 사용
                return book;
            }
        }
        return null;
    }
    
    // 전체 목록 반환
    public ArrayList<Book> findAll() { 
        return books; // books 배열의 모든 객체 반환
    }
}