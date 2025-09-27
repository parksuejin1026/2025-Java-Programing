package ch04;

public class whiletest1 {

	public static void main(String[] args) {
		int iLoop = 10;
		int i = 0;
		int j = 0;
		while (i < iLoop) {
			j = 0;
		
		 while (j <= i) {
			System.out.print("*");
			j++;
		 }
		}
		System.out.println("");
		i++;
	}

}
