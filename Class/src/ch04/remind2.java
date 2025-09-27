package ch04;

import java.util.Scanner;

public class remind2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int intX = scan.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int intY = scan.nextInt();
		
		System.out.println("첫 번째 정수 : " + intX);
		System.out.println("첫 번째 정수 : " + intY);
		
		if(intX > intY) {
			System.out.println("intX = " + intX +"intY = " + intY);
		}
		System.out.println("intY = " + intY +"intX = " + intX);
		
	}

}
