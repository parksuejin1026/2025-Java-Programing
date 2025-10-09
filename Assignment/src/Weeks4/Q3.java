package Weeks4;

public class Q3 {

	public static void main(String[] args) {
		while(true) {
			int dice1 = (int) (Math.random() * 6 ) +1 ;
			int dice2 = (int) (Math.random() * 6 ) +1 ;
			
			System.out.printf("눈 1 : %d , 눈 2 : %d 두 눈의 총합이 5가 되어 실행을 멈춥니다.\n ", dice1,dice2);
			
			if(dice1 + dice2 == 5) {
				System.out.println("눈1 : " + dice1 + "눈2 : " + dice2 + "주사위 두 눈의 총합이 5가 되어 실행을 멈춥니다.");
				break;
			}
		}
	}

}
