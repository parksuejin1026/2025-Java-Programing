package test;

public class Test1 {

	public static void main(String[] args) {
		String[] stringNumbers = {"10", "20", "A30", "40", "50"};
		int[] intArray = new int[4];
		System.out.println("1.Start! =========================================");
		for(int i = 0 ; i < stringNumbers.length ; i ++ ) { 
			try {
				intArray[i] = Integer.parseInt(stringNumbers[i]);
				System.out.printf("[%d] Success\n", intArray[i]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ë°°ì—´?¸ë±?¤ê? ì´ˆê³¼??" + e.getMessage() + e.toString()
				);
			}
			catch (NumberFormatException e) {
				System.out.println("?«ìžë¡?ë³€?˜í•  ???†ìŒ "
						+ "" + e.getMessage());
			}
			
		}
		System.out.println("2.End! ======================================");
		
		
	}

}
