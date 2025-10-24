package ch07.proTected.package1;

public class B {
	// 메서드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
