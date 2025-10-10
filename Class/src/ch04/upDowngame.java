package ch04;

import java.util.Scanner;

public class upDowngame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int attempts = 0;
		int num = (int)(Math.random() * 10)+1;
		System.out.println("Up & Down Game!");
		while(true) {
			System.out.print("1~10까지의 숫자 중 하나를 맞춰보세요!");
			input = sc.nextInt();
			attempts++;
			
			if(input > num) {
				System.out.println("Down!");
			}
			else if(input < num){
				System.out.println("Up!");
			}
			else {
				System.out.println(num + " 정답입니다!");
				System.out.println(attempts+ "번 만에 맞췄어요!");
				break;
		}
	}
	}
}


/*
1. 1 ~ 10 까지의 랜덤 숫자를 발생시키고
숫자를 입력 받아 맞추는 프로그램을 작성하시오.
2.입력한 숫자가 랜덤 숫자보다 작으면 Up
   입력한 숫자가 랜덤 숫자보다 크면 Down
    맞으면  Bingo 표시
3.맞추는 기회는 3번 까지
*/