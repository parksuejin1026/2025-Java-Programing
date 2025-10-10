package Weeks5;

import java.util.Scanner;
public class upDownGame {

	public static void main(String[] args) {
		int num = (int)(Math.random()*20)+1;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int attempt = 0; 
		System.out.println("Up!Down! Game!");
		
		while(true) {
			System.out.print("1~20까지의 숫자중 하나를 적어보세요");
			input = sc.nextInt();
			attempt++;
			
			if(input > num) {
				System.out.println("Down!");
			}
			else if(input < num){
				System.out.println("Up!");
			}
			else {
				System.out.println(num + " 정답입니다!");
				System.out.println(attempt+ "번 만에 맞췄어요!");
				break;
			}
		}
	}

}



