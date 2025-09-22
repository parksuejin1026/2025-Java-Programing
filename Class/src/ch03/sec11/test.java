package ch03.sec11;

public class test {

	public static void main(String[] args) {
		int num = 10;
		String solve = (num > 0) ? " 양수" : ((num == 0) ? "0" : " 음수");
		System.out.println("숫자 " + num + "은" + solve + "다.");
		
		int num2 = 10;
		String solve2 = (num % 2 == 0) ? "2의 배수이다." : ((num % 3 == 0) ? "3의 배수이다." : "아무것도 아니다.");
		System.out.printf("숫자 %d는 %s", num2, solve2);
	}

}
