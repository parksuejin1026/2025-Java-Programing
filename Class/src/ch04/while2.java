package ch04;

public class while2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1 부터 " + (i-1) + " 까지의 합은 = " + sum);
	}

}
