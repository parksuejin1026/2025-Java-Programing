package ch04;

public class For4 {

	public static void main(String[] args) {
		for (int m=2 ; m<=9 ; m++) {
			if(m == 7)  {
				continue;
			}
			System.out.println(" *** " + m + "단 *** ");
			
			for(int n = 1; n <= 9 ; n++ ) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}

}
