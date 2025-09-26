package ch04;

public class remind {

	public static void main(String[] args) {
		int apple = 123;
		int appleBundle = 0;
		if(apple % 10 != 0) {
			
			appleBundle++;
		}
		System.out.println("1.Total Need Bundle Count : " + appleBundle + " cnt");
		System.out.println("2.Total Need Bundle Count : " + apple / 10 + " cnt");
		
	}

}
