package Test;

import java.util.Scanner;

public class Test3Action {

	public static void main(String[] args) {
		Test3 t = new Test3();
		Scanner sc = new Scanner(System.in);
		String stuName;
		int stuNum;
		int randInt1 = 0;
		int randInt2 = 0;
		int randInt3 = 0;
		int randInt4 = 0;
		int randInt5 = 0;
		
		
		int[][]	score = new int[10][5];
		for(int i = 0; i < score.length ; i++) {
			System.out.print("학생의 이름을 입력해주세요 : ");
			stuName = sc.next();
			System.out.print("학생의 학번을 입력해주세요(ex:0000): ");
			stuNum = sc.nextInt();
			t.Test3(stuName, stuNum);
			randInt1 = (int)(Math.random()*40) + 60;
			randInt2 = (int)(Math.random()*40) + 60;
			randInt3 = (int)(Math.random()*40) + 60;
			randInt4 = (int)(Math.random()*40) + 60;
			randInt5 = (int)(Math.random()*40) + 60;
			score[i][0] = randInt1;
			score[i][1] = randInt2;
			score[i][2] = randInt3;
			score[i][3] = randInt4;
			score[i][4] = randInt5;
		}
		
		
		
	}

}
