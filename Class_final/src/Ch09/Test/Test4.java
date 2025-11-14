package Ch09.Test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 야구 게임을 완성하시오.
		// 1. q,Q 면 게임 종료
		// 2. Scanner 입력 받은 스트링 값 분해
		Scanner sc = new Scanner(System.in);
		int[] secret = new int[3];
		
		for( int i = 0 ; i < 3 ; i ++ ) {
			while (true) {
				int num = (int)(Math.random()*10);
				if ( i == 0 && num == 0) continue;
				boolean dup = false;
				for (int j = 0 ; j < i ; j ++ ) {
					if (secret[j] == num ) dup = true;
				}
				if (!dup) {
					secret[i] = num;
					break;
				}
			}
		}
		
		System.out.println(secret[0]+secret[1]+secret[2]);
		
		int[] guess = new int[3];
		while(true) {
			System.out.print("input Number (ex : 123) : ");
			String inputData = sc.nextLine();
			for ( int i = 0 ; i < 3 ; i ++ ) {
				guess[i] = inputData.charAt(i) - '0';
				}
			if (guess[0] == guess[1] || guess[1] == guess[2] || guess[0] == guess[2]) {
				System.out.println("Warnning : Same number is not allowed!!");
				continue;
			}
			int strike = 0, ball = 0;
			for (int i = 0 ; i < 3 ; i ++) {
				for ( int j = 0 ; j < 3 ; j ++) {
					if (secret[i] == guess[j]) {
						if (i == j) strike ++;
						else ball ++;
					}
				}
			}System.out.printf("[1Th] Result : %d S, %d B \n", strike, ball);
			if(strike == 3) {
				System.out.println("congraturation!!");
			}
		}
		
		
	}

}
