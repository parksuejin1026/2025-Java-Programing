package test;

public class Test3 {
	// ?„ë“œ ?ì„±
	String student;
	int studentNum = 0;
	String[][] array = new String[10][8];
	int randInt1 = 0;
	int randInt2 = 0;
	int randInt3 = 0;
	int randInt4 = 0;
	int randInt5 = 0;
	
	void Test3(String studnt, int studentNum) {
		student = this.student;
		studentNum = this.studentNum;
	}
	void stuInfor() {
		for(int i = 0 ; i < array.length ; i ++ ) {
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
