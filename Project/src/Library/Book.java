package Library;

/**
 * 도서 정보를 담는 엔티티 클래스입니다.
 * 모든 필드는 private으로 선언하여 캡슐화를 구현합니다.
 */
public class Book {
    // 1. private 필드: 책의 속성
    private String title; // 제목
    private String author; // 저자
    private String isbn; // 국제표준도서번호 원래는 13자리 숫자지만 여기선 4자리로 변경
    private boolean isRented; // 대여 상태 (true: 대여 중)

    /**
     * Book 객체를 초기화하는 생성자입니다.
     * @param isRented 초기 대여 상태 (초기값은 보통 false)
     */
    public Book(String title, String author, String isbn, boolean isRented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isRented = isRented;
    }

    // 2. Getter (접근자): private 필드의 값을 안전하게 반환합니다.
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public boolean isRented() { return isRented; }

    // 3. Setter (설정자): 대여 상태만 변경 가능하도록 합니다.
    /**
     * 도서의 대여 상태를 변경합니다.
     * @param isRented 새로운 대여 상태
     */
    public void setRented(boolean isRented) { 
        this.isRented = isRented; 
    }

    // 4. 객체의 정보를 읽기 쉬운 문자열로 반환합니다.
    @Override
    public String toString() {
        String status = isRented ? "❌ 대여 중" : "⭕️ 대여 가능"; // 삼항연산자 
        return String.format("제목: %s | 저자: %s | ISBN: %s | 상태: %s", title, author, isbn, status);
    }
}