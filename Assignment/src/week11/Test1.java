package week11;

public class Test1 {

	public static void main(String[] args) {
		// 1 ~ 100 ?�자 �?3??배수가 ?�닌 것을 모두 출력?�고, 모두 �?개인지 ?�시?�시??
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
		} System.out.printf("\n -- 3??배수가 ?�닌 ?�는 �?%d�? --", count);
	}

}
