package ch05;

import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		int attempt = 0;
		String input = "0";
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10까지의 숫자 중 랜덤한 숫자를 맞춰보세요");
		
		while(true) {
			System.out.print(">");
			input = sc.nextLine();
			if(input.equals(String.valueOf(num))) { // if(input.equals(String.valueOf(num))) 스트링으로 변환하고 검사
				System.out.println("정답입니다!");
				break;
			}
			else {
				System.out.println("다시 한번 시도해주세요");
			}
			attempt++;
			if(attempt==3) {
				System.out.println("3번의 기회를 모두 소진했습니다.");
				break;
			}
			
		}
		
	}

}
