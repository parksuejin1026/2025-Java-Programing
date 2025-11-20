package ch08;

public class sTar {

	public static void main(String[] args) {
		int all = 5;
		for(int i = 0 ; i < all ; i++ ) {
			for(int j = 0 ; j < all; j++) 
			{
				if(i<=j)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println(" ");
		}
		
		}
	}
