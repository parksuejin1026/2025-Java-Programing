package Library;

public class Book {
    // 1. private 필드: 책의 속성
    private String title; // 제목
    private String author; // 저자
    private String isbn; // 국제표준도서번호 원래는 13자리 숫자지만 여기선 4자리로 변경
    private boolean isRented; // 대여 상태 (true: 대여 중)

    public Book(String title, String author, String isbn, boolean isRented) { // 생성자
        this.title = title; // 제목
        this.author = author; // 저자
        this.isbn = isbn; // 도서 ID
        this.isRented = isRented; // 대여 상태
    }

    // 2. Getter 메서드 제목, 도서번호, 대여상태 반환
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isRented() {
        return isRented;
    }

    // Setter 메서드 대여 상태 설정
    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    // 4. 객체의 정보를 읽기 쉬운 문자열로 반환
    public String toString() {
        String status = isRented ? "❌ 대여 중" : "⭕️ 대여 가능"; // 삼항연산자
        return String.format("제목: %s | 저자: %s | ISBN: %s | 상태: %s", title, author, isbn, status);
    }
}