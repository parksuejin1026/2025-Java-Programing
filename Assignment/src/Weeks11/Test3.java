package Weeks11;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 4개의 정수를 입력 받아 큰 숫자부터 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[4];
		
		
		System.out.println("정수 입력 및 출력 프로그램");
		
		System.out.print("첫 번째 숫자를 입력해주세요! -- ");
		numbers[0] = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력해주세요! -- ");
		numbers[1] = sc.nextInt();
		
		System.out.print("세 번째 숫자를 입력해주세요! -- ");
		numbers[2] = sc.nextInt();
		
		System.out.print("네 번째 숫자를 입력해주세요! -- ");
		numbers[3] = sc.nextInt();
		
		sc.close();
		
		int n = numbers.length;
		int temp; // 값 교환을 위한 임시 변수
		
		System.out.println("입력하신 숫자를 내림차순으로 출력하겠습니다.");
		for (int i = 0 ; i < n - 1 ; i ++) { // 총 3번을 반복하여 옮김
			for (int j = 0 ; j < n - 1 - i ; j ++) {
				if (numbers[j] < numbers[j+1]) { // 현재 값인 (j)가 다음 값(j+1)보다 작으면 실행
					temp = numbers[j]; // 임시변수에 작은 값 저장
					numbers[j] = numbers[j+1]; // 현재 인덱스에 큰 값 저장
					numbers[j+1] = temp; // 다음 인덱스에 작은 값 저장
				}
			}
		}
		
		// 3. 정렬된 배열 (내림차순) 출력
		System.out.print("큰 숫자부터 출력 : ");
		for (int i = 0 ; i < n ; i++) {
			System.out.print(numbers[i]);
			
			// 마지막 숫자 다음에는 쉼표를 찍지 않도록 처리
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(); 
		
		
	}

}
