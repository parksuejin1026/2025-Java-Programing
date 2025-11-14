package Ch09;

public class A {
	// 인스턴스 맴버 클래스
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
	
	// A 생성자
	A() {
		B b = new B();
		b.ShowBS();
	}
	
	// 인스턴스 메서드
	void method() {
		B b = new B("method");
		b.ShowBS();
	}
}
