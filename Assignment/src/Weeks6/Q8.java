package Weeks6;

public class Q8 {

	public static void main(String[] args) {
		int [][] array = { 
	            {95,85}, 
	            {83, 92, 96}, 
	            {78, 83, 93, 87, 88} 
	        };

	        // 1. 합계와 전체 요소 개수를 저장할 변수 초기화
	        int sum = 0;
	        int count = 0;
	        
	        // 2. 외부 for문: 행(row) 반복
	        // array.length는 전체 행의 개수 (여기서는 3)
	        for (int i = 0; i < array.length; i++) {
	            
	            // 3. 내부 for문: 열(column) 반복
	            // array[i].length는 현재 행(i)의 요소 개수 (각각 2, 3, 5)
	            for (int j = 0; j < array[i].length; j++) {
	                
	                // 현재 요소의 값을 sum에 더함
	                sum += array[i][j];
	                
	                // 요소가 하나 처리될 때마다 count를 1 증가시킴
	                count++;
	            }
	        }
	        
	        // 4. 평균 계산
	        // 정확한 평균을 위해 double 타입으로 계산
	        double average = (double) sum / count;
	        
	        // 5. 결과 출력
	        System.out.println("배열 항목의 전체 합계: " + sum);
	        System.out.println("배열 항목의 전체 개수: " + count);
	        System.out.println("배열 항목의 전체 평균: " + average);
	}

}
