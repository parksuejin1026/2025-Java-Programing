package week04;

public class Q3 {

	public static void main(String[] args) {
		while(true) {
			int dice1 = (int) (Math.random() * 6 ) +1 ;
			int dice2 = (int) (Math.random() * 6 ) +1 ;
			
			System.out.printf("??1 : %d , ??2 : %d ???�의 총합??5가 ?�어 ?�행??멈춥?�다.\n ", dice1,dice2);
			
			if(dice1 + dice2 == 5) {
				System.out.println("?? : " + dice1 + "?? : " + dice2 + "주사?????�의 총합??5가 ?�어 ?�행??멈춥?�다.");
				break;
			}
		}
	}

}
