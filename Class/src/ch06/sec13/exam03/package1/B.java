package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; 사용 불가능함 왜냐하면 private를 사용하면 같은 class에서만 작동 가능함
		
		a.method1();
		a.method2();
		// a.method3(); 같은 이유로 private라 안됨
	}
}
