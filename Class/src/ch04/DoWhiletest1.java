package ch04;

import java.util.Scanner;

public class DoWhiletest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString;
		int speed = 0;

		do {
			System.out.println("---------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
			System.out.println("현재 속도: " + speed); // 현재 상태를 보여주면 좋습니다.
			System.out.println("---------------------------");
			System.out.print("선택 : ");
			inputString = sc.nextLine();
			
			if (inputString.equals("1") || inputString.equals("증속")) {
				speed++;
				System.out.println(">> 증속: 현재 속도 " + speed);
			} else if (inputString.equals("2") || inputString.equals("감속")) {
				speed--;
				System.out.println(">> 감속: 현재 속도 " + speed);
			} else if (inputString.equals("3") || inputString.equals("중지")) {
				System.out.println(">> 프로그램 종료");
			} else {
				System.out.println(">> 잘못된 입력입니다. 다시 선택해주세요.");
			}

		// '중지'를 입력할 때까지 반복합니다.
		} while (!inputString.equals("3") && !inputString.equals("중지"));

		sc.close();
	}
}