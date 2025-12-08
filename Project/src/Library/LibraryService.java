package Library;

import java.util.ArrayList;

/**
 * 도서관의 비즈니스 로직(규칙)을 처리하는 서비스 클래스입니다.
 */
public class LibraryService implements LibraryServiceContract {
    
    private LibraryRepository repository; // LibraryRepository 클래스를 사용
    
    public LibraryService() {
        this.repository = new LibraryRepository(); // Repository 객체 생성
    }
    
    /**
     * [⭐ 통합 검색 헬퍼 메서드] ID 또는 제목으로 책을 찾습니다.
     * ID 검색을 먼저 시도하고, 실패하면 제목 검색을 시도하여 유연성을 확보합니다.
     */
    private Book findBook(String searchKey) {
        // 1. ID(ISBN)로 먼저 검색 시도
        Book book = repository.findByIsbn(searchKey);
        
        // 2. ID로 찾지 못했으면, 제목으로 검색 시도
        if (book == null) {
            book = repository.findByTitle(searchKey);
        }
        
        return book;
    }
    
    @Override
    public String registerBook(String title, String author, String isbn) { // 도서 등록하기
        if (ValidationUtil.isEmpty(title) || ValidationUtil.isEmpty(isbn)) { // 제목, ID는 필수 입력 항목이기 때문에 공백이면 안됨
            return "[❌ 오류] 제목과 ID는 필수 입력 항목입니다.";
        }
        
        if (repository.findByIsbn(isbn) != null) { // ID가 이미 등록되어 있다면 등록 불가
            return "[❌ 오류] 이미 등록된 ID입니다.";
        }
        
        Book newBook = new Book(title, author, isbn, false); // 모든 절차가 완료되었다면 Book 클래스의 생성자 사용
        repository.save(newBook); // 도서 저장소에 등록하기 
        return "✅ 도서 등록 완료: " + title; // 도서 등록 완료 메시지 + 도서 제목
    }
    
    
    @Override // 도서를 제목 또는 ID로 빌리는 메서드
    public String rentBook(String searchKey) {
        if (ValidationUtil.isEmpty(searchKey)) {
            return "[❌ 오류] ID나 제목을 입력해 주세요.";
        }

        Book book = findBook(searchKey); // 통합 검색 사용
        
        if (book == null) { // 해당하는 책이 없다면
            return "[❌ 오류] 해당 ID 또는 제목의 도서를 찾을 수 없습니다.";
        }
        
        if (book.isRented()) { // 책을 이미 빌리고 있다면
            return "[❌ 오류] '" + book.getTitle() + "'는 이미 대여 중입니다.";
        }
        
        book.setRented(true); // isRented 필드를 true로 변경하여 도서 대여 상태로 변경
        return "✅ 대여 성공: '" + book.getTitle() + "'";
    }
    
    @Override // 도서를 제목 또는 ID로 반납하는 메서드
    public String returnBook(String searchKey) { 
        if (ValidationUtil.isEmpty(searchKey)) {
            return "[❌ 오류] ID나 제목을 입력해 주세요.";
        }

        Book book = findBook(searchKey); // 통합 검색 사용

        if (book == null) {
            return "[❌ 오류] 해당 ID 또는 제목의 도서를 찾을 수 없습니다.";
        }

        if (!book.isRented()) {
            return "[❌ 오류] '" + book.getTitle() + "'는 대여 상태가 아닙니다.";
        }
        
        book.setRented(false);  // isRented 필드를 false로 변경하여 도서 반납 상태로 변경
        return "✅ 반납 성공: '" + book.getTitle() + "'.";
    }

    @Override
    public ArrayList<Book> getAllBooks() { // 도서 목록 전체 반환
        return repository.findAll();
    }
}