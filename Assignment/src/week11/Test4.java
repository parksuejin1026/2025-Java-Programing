package week11;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		System.out.print("�?번째 ?�자�??�력?�주?�요! -- ");
		int num1 = sc.nextInt();
		
		System.out.print("??번째 ?�자�??�력?�주?�요! -- ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("?�셈 결과 : %d + %d = %d\n", num1, num2, cal.add(num1, num2));
		System.out.printf("뺄셈 결과 : %d - %d = %d\n", num1, num2, cal.subtract(num1, num2));
		System.out.printf("곱셈 결과 : %d x %d = %d\n", num1, num2, cal.mult(num1, num2));
		System.out.printf("?�눗??결과 : %d / %d = %.2f\n", num1, num2, cal.divide(num1, num2));
		
		cal.powerOff();
	}

}
