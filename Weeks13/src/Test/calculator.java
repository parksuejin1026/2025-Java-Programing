package test;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int result = 0;
		String operator;
		System.out.println("---------- ?¬ì¹™?°ì‚° ê³„ì‚°ê¸?----------");
		
		while(true) {
			System.out.print("ì²?ë²ˆì§¸ ê°’ì„ ?…ë ¥?´ì£¼?¸ìš” : ");
			num1 = sc.nextInt();
			while(true) {
			System.out.print("??ë²ˆì? ê°’ì„ ?…ë ¥?´ì£¼?¸ìš” : ");
			num2 = sc.nextInt();
			
			System.out.print("?°ì‚°?ë? ?…ë ¥?´ì£¼?¸ìš” : ");
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
					System.out.println("0?¼ë¡œ???˜ëˆŒ ???†ìŠµ?ˆë‹¤!");
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
