package Library;

import java.util.ArrayList;

/**
 * 도서관의 비즈니스 로직(규칙)을 처리하는 서비스 클래스입니다.
 */
public class LibraryService implements LibraryServiceContract {
    
    private LibraryRepository repository;
    
    public LibraryService() {
        this.repository = new LibraryRepository();
    }
    
    private Book findBook(String searchKey) { // 책 찾는 메서드
        Book book = repository.findByIsbn(searchKey); // ID를 조사하여 존재한다면 book 객체에 책 정보 저장
        if (book == null) { // 만약 ID를 입력하지 않았다면 책의 이름을 조사한다.
            book = repository.findByTitle(searchKey);
        }
        return book; 
    }
    
    // ----------------------------------------------------
    // registerBook: 오류 시 throws BookException
    // ----------------------------------------------------
    @Override
    public void registerBook(String title, String author, String isbn) throws BookException {
        if (ValidationUtil.isEmpty(title) || ValidationUtil.isEmpty(isbn)) { // 제목과 ID가 공백이 아닌 지 확인
            throw new BookException("제목과 ID는 필수 입력 항목입니다."); // 둘 다 공백이면 오류 메시지 출력
        }
        
        if (repository.findByIsbn(isbn) != null) {            
            throw new BookException("이미 등록된 ID입니다."); // 책의 ID는 같기때문에 굳이 제목 예외까지는 추가안함
        }
        
        // 정상 처리 시: 성공 메시지 출력 없이 종료 (App에서 성공 메시지 출력)
        Book newBook = new Book(title, author, isbn, false); 
        repository.save(newBook); // 도서 등록하기
    }
    
    // ----------------------------------------------------
    // rentBook: 오류 시 throws BookException
    // ----------------------------------------------------
    @Override 
    public void rentBook(String searchKey) throws BookException { // 도서 대여하기
        if (ValidationUtil.isEmpty(searchKey)) { // 제목과 ID가 공백이라면
            throw new BookException("ID나 제목을 입력해 주세요."); // 오류 메시지 호출
        }

        Book book = findBook(searchKey); // ID와 제목을 조사하여 도서가 존재한다면 book 객체에 데이터 저장
        
        if (book == null) { // 맞는 값이 없다면 리턴하지못해 공백으로 출력
            throw new BookException("해당 ID 또는 제목의 도서를 찾을 수 없습니다.");
        }
        
        if (book.isRented()) { // findBook으로 책의 제목을 출력받아 그 책의 대여상태 체크
            throw new BookException("'" + book.getTitle() + "'는 이미 대여 중입니다."); // 대여상태라면 오류 메시지 출력
        }
        
        // 정상 처리 시: 성공 메시지 출력 없이 종료
        book.setRented(true); 
    }
    
    // ----------------------------------------------------
    // returnBook: 오류 시 throws BookException
    // ----------------------------------------------------
    @Override
    public void returnBook(String searchKey) throws BookException { // 도서 반납하기
        if (ValidationUtil.isEmpty(searchKey)) { // 공백을 입력하지 않았는 지 확인
            throw new BookException("ID나 제목을 입력해 주세요."); // 공백이라면 오류 메시지 출력
        }

        Book book = findBook(searchKey); // ID와 제목을 조사하여 도서가 존재한다면 book 객체에 데이터 저장

        if (book == null) { 
            throw new BookException("해당 ID 또는 제목의 도서를 찾을 수 없습니다."); // 호출할 오류 메시지
        }

        if (!book.isRented()) { // isRented가 false 일 때(대여 상태가 아닐 때) 오류메시지 출력
            throw new BookException("'" + book.getTitle() + "'는 대여 상태가 아닙니다."); 
        }
        

        book.setRented(false); // 반납 처리 완료 상태로 변경
    }

    @Override
    public ArrayList<Book> getAllBooks() { // 모든 책을 출력하는 getter 메서드
        return repository.findAll(); // 저장되어 있는 책의 모든 필드 출력
    }
}