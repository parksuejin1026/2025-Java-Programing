package Weeks11;

public class Test1 {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중 3의 배수가 아닌 것을 모두 출력하고, 모두 몇 개인지 표시하시오.
		int count = 0;
		for (int i = 1 ; i <= 100 ; i++ ) {
			if (i % 3 != 0) {
				System.out.printf("%d\t", i);
				count ++;
				if(count % 10 == 0) {
					System.out.println();
				}
			} 
			else continue;
		} System.out.printf("\n -- 3의 배수가 아닌 수는 총 %d개! --", count);
	}

}
