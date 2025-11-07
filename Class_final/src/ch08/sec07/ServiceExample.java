package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		Service ser = new ServiceImpl();
		
		ser.defaultMethod1();
		System.out.println();
		ser.defaultMethod2();
		System.out.println();
		
	//	ser.staticMethod1();
		
		
	}

}
