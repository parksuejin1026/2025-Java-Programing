package Ch09.Test;

public class Test2_2 {

	public static void main(String[] args) {
		
		// 1~100 숫자 중 7의 배수를 모두 출력하고, 모두 몇 개인지 표시하시오.
		
		int count = 0;  
		int spaceCount = 0;
		for ( int i = 1 ; i <= 100 ; i ++ ) {
			if ( i % 7 == 0) {
				System.out.printf("%d ", i);
				count++;
				spaceCount++;
			}
			if (spaceCount == 10) {
				System.out.println("");
				spaceCount = 0;
				
			}
		}
		
		System.out.printf("\n7의 배수의 총 개수는 %d개이다.", count);
	}

}