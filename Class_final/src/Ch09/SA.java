package ch09;

public class SA {
	static class SB {}
		
	SB field1 = new SB();
	
	static SB field2 = new SB();
	
	SA() {
		SB b = new SB();
	}
	
	void method1() {
		SB b = new SB();
	}
	
	static void method2() {
		SB b = new SB();
	}
}
