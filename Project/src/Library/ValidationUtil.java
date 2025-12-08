package Library;


public class ValidationUtil {
    
  
    public static boolean isEmpty(String str) { // static으로 선언하여 바로 사용 가능
        return str == null || str.trim().isEmpty(); // 뒤에는 " "인 상태가 있을수도 있기때문에 trim으로 공백을 없애고 다시 확인
    }
}