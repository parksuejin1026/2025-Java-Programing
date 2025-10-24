package ch07.proTected.package2;

import ch07.proTected.package1.A;
public class D extends A{
	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();
	}
	
	// 메서드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";
		// A 메서드 호출
		this.method();
	}
	
	// 메서드 선언
	public void method2() {
		// A a = new A();
		// a.field = "value";
		// a.method();
	}
}
