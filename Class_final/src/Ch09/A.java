package ch09;

public class A {
	// ?∏Ïä§?¥Ïä§ Îß¥Î≤Ñ ?¥Îûò??
	class B {
		String BS = "";
		
		B() {
			this.BS = "Null";
		}
		
		B(String BS) {
			this.BS = BS;
		}
		
		void ShowBS() {
			System.out.println("BS : " + BS);
		}
		
	}
	
	B field = new B();
	
	// A ?ùÏÑ±??
	A() {
		B b = new B();
		b.ShowBS();
	}
	
	// ?∏Ïä§?¥Ïä§ Î©îÏÑú??
	void method() {
		B b = new B("method");
		b.ShowBS();
	}
}
