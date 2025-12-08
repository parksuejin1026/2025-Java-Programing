package ch09;

public class AExam {

	public static void main(String[] args) {
		// A 객체 ?�성
		A a = new A();
		a.method();
		
		// B 객체 ?�성
		A.B b = a.new B();
		b.ShowBS();
		
	}

}
