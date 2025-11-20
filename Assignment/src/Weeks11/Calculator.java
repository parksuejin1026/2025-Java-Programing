package Weeks11;

public class Calculator {
	void powerOn() {
		System.out.println("계산기를 실행합니다.");
	}
	
	void powerOff() {
		System.out.println("계산기를 종료합니다.");
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
			System.out.println("오류 : 0으로 나눌 수 없습니다.");
		}
		return (double) a / b;
	}
	
	
}
