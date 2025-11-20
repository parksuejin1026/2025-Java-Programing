package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;
public class C {
	public C() {
		
		A a = new A();
		
		a.field1 = 1;
		// a.field2 = 1; 사용 불가능함 같은 패지키에서만 사용 가능하기 때문에
		// a.field3 = 1; 사용 불가능함 왜냐하면 private를 사용하면 같은 class에서만 작동 가능함
		
		a.method1();
		// a.method2(); 패키지가 바뀌어 사용 불가능
		// a.method3(); 같은 이유로 private라 안됨
	}
}
