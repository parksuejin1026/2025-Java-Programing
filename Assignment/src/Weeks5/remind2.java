package Weeks5;

public class remind2 {

    public static void main(String[] args) {
        int n = 10
        		; // 삼각형의 높이 (크기)를 5로 설정했습니다. 10으로 바꾸셔도 됩니다.

        // i: 0부터 n-1까지 (줄 수)
        for (int i = 0; i < n; i++) {
            
            // 공백 출력: (n - 1 - i) 만큼 출력하여 오른쪽으로 정렬
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.printf(" ");
            }
            
            // 별 출력: (i + 1) 만큼 출력
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            
            System.out.println(); // 줄 바꿈
        }
        
        // i: 0부터 n-1까지 (줄 수)
        for (int i = 0; i < n; i++) {
            
            // 공백 출력: i 만큼 출력하여 오른쪽으로 정렬
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            
            // 별 출력: (n - i) 만큼 출력
            for (int j = i; j < n; j++) {
                System.out.printf("*");
            }
            
            System.out.println(); // 줄 바꿈
        }
    }
}

