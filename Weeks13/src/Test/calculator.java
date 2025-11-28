package Test;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int result = 0;
		String operator;
		System.out.println("---------- 사칙연산 계산기 ----------");
		
		while(true) {
			System.out.print("첫 번째 값을 입력해주세요 : ");
			num1 = sc.nextInt();
			while(true) {
			System.out.print("두 번쨰 값을 입력해주세요 : ");
			num2 = sc.nextInt();
			
			System.out.print("연산자를 입력해주세요 : ");
			operator = sc.next();
			
			if(operator.equals("+")) {
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				result = num1 + num2;
			}
			else if(operator.equals("-")) {
				System.out.printf("%d + %d = %d\n", num1, num2, num1 - num2);
				result = num1 - num2;
			}
			else if(operator.equals("*")) {
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
				result = num1 * num2;
			}
			else if(operator.equals("/")) {
				if(num2 == 0) {
					System.out.println("0으로는 나눌 수 없습니다!");
					continue;
				}
				System.out.printf("%f / %f = %f\n", num1, num2, num1 / num2);
				result = num1 / num2;
				}
				num1 = result;
		
			}
		

		}	
	}
}
