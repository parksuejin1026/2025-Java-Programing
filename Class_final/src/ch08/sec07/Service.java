package ch08.sec07;

public interface Service {
	default void defaultMethod1() {
		defaultCommonCheck("디폴트메서드1");
		System.out.println("디폴트메서드1 종속 코드");
		
	}
	
	default void defaultMethod2() {
		defaultCommonCheck("디폴트메서드2");
		System.out.println("디폴트메서드2 종속 코드");
	}
	
	private void defaultCommonCheck(String sVal) {
		if( (sVal.length() < 1) || (sVal.isEmpty()))
			System.out.println("Execute Method is Null... ");
	}
	
	static void staticMethod1() {
		staticCommonCheck(5);
		System.out.println("스태틱메서드1 종속 코드");
	}
	
	static void staticMethod2() {
		staticCommonCheck(0);
		System.out.println("스태틱메서드2 종속 코드");
	}
	
	private static void staticCommonCheck(int iVal) {
		if(iVal > 0) 
			System.out.println("스태틱 메서드 1은 OK");
		else
			System.out.println("스태틱 메서드 2는 not OK");
	}
}
