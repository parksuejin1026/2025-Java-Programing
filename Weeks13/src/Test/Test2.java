package Test;

public class Test2 {

	public static void main(String[] args) {
		int[][]	score = new int[10][2];
		int randInt1;
		int randInt2;
		int Mmax = 0;
		int Mmin = 100;
		int Emax = 0;
		int Emin = 100;
		double math = 0.0;
		double english = 0.0;
		for(int i = 0 ; i < score.length ; i++ ) {
			randInt1 = (int)(Math.random()*40) + 60;
			randInt2 = (int)(Math.random()*40) + 60;
			for(int j = 0 ; j < 1 ; j++) {
				score[i][j] = randInt1;
				score[i][j+1] = randInt2;
				if(Mmax<score[i][j]) {
					Mmax = score[i][j];
				}
				else if(Mmin>score[i][j]) {
					Mmin = score[i][j];
				}
				if(Emax<score[i][j+1]) {
					Emax = score[i][j+1];
				}
				else if(Emin > score[i][j+1])
					Emin = score[i][j];
			}
			
		}
		for(int i = 0; i < score.length ; i++) {
			math += score[i][0];
			english += score[i][1];
		}
		
		System.out.printf("수학 점수의 최댓값 : %d, 수학 점수의 최솟값 : %d, 수학 점수의 평균 값 : %.2f \n",
				Mmax, Mmin, math / 10);
		System.out.printf("영어 점수의 최댓값 : %d, 영어 점수의 최솟값 : %d, 영어 점수의 평균 값 : %.2f \n",
				Emax, Emin, english /10
				);

	}

}


