package Library;

public class BookException extends Exception { // 자바의 기본 구성 클래스 exception을 부모 클래스로 둠

    public BookException(String message) { // 오류 메시지 저장
        super(message);
    }
}