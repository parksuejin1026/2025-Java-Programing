package Weeks11;

public class Test2 {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중 7의 배수를 모두 출력하고, 모두 몇 개인지 표시 하시오.
		int count = 0;
		for ( int i = 1 ; i <= 100 ; i ++ ) {
			if ( i % 7 == 0) {
				System.out.printf("%d \t", i);
				count ++;
				if( count % 10 == 0 ) {
					System.out.println();
				}
			} else continue;
		} 
		System.out.printf("\n -- 1 ~ 100중 7의 배수는 총 %d개! --", count );
	}

}
