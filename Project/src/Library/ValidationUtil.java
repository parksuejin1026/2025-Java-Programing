package Library;

/**
 * 입력 값의 유효성을 검사하는 정적(static) 메서드들을 모아둔 유틸리티 클래스입니다.
 * static으로 선언하여 객체 생성 없이 바로 사용 가능합니다.
 */
public class ValidationUtil {
    
    /**
     * 문자열이 null이거나 비어있는지 확인합니다.
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty(); // 뒤에는 " "인 상태가 있을수도 있기때문에 trim으로 공백을 없애고 다시 확인
    }
}