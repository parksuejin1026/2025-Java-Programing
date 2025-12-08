package week11;

public class Calculator {
	void powerOn() {
		System.out.println("ê³„ì‚°ê¸°ë? ?¤í–‰?©ë‹ˆ??");
	}
	
	void powerOff() {
		System.out.println("ê³„ì‚°ê¸°ë? ì¢…ë£Œ?©ë‹ˆ??");
	}
	int add ( int a, int b ) {
		return a + b;
	}
	
	int mult ( int a, int b ) {
		return a * b;
	}
	
	int subtract ( int a, int b ) {
		return a - b;
	}
	
	double divide ( int a, int b ) {
		if (b == 0) {
			System.out.println("?¤ë¥˜ : 0?¼ë¡œ ?˜ëˆŒ ???†ìŠµ?ˆë‹¤.");
		}
		return (double) a / b;
	}
	
	
}
