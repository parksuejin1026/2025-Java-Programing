package ch06.sec13.exam03.package1;

public class A {
	// 접근 제한을 public으로 모든 패키지에 아무런 제한 없이 생성 가능
	public int field1;
	// default 접근 제한을 갖는다. 같은 패키지에서는 아무런 제한 없이 생성자 호출 가능
	int field2;
	// 클래스 내부에서만 생성자를 호출 할 수 있는 private 접근 제한자
	private int field3;
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	// 아무런 패키지에서 사용가능
	public void method1() {
		
		
	}
	// default 같은 패키지에서는 선언 가능
	void method2() {
		
	}
	// 클래스 내부에서만 사용 가능한 private
	private void method3() {
		
	}
}
