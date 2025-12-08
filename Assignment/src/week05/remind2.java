package week05;

public class remind2 {

    public static void main(String[] args) {
        int n = 10
        		; // ?�각?�의 ?�이 (?�기)�?5�??�정?�습?�다. 10?�로 바꾸?�도 ?�니??

        // i: 0부??n-1까�? (�???
        for (int i = 0; i < n; i++) {
            
            // 공백 출력: (n - 1 - i) 만큼 출력?�여 ?�른쪽으�??�렬
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.printf(" ");
            }
            
            // �?출력: (i + 1) 만큼 출력
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            
            System.out.println(); // �?바꿈
        }
        
        // i: 0부??n-1까�? (�???
        for (int i = 0; i < n; i++) {
            
            // 공백 출력: i 만큼 출력?�여 ?�른쪽으�??�렬
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            
            // �?출력: (n - i) 만큼 출력
            for (int j = i; j < n; j++) {
                System.out.printf("*");
            }
            
            System.out.println(); // �?바꿈
        }
    }
}

