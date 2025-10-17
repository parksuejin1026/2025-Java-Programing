package ch06;

public class MultipleTable {
	void Multiple(int x) {
		System.out.println(x + "단");
		for(int i = 1 ; i < 10; i++) {
		
			System.out.printf("%d * %d = %d\n" , x, i, x * i);
			
		}
		return;
	}
}
