package Ch09;

public class AExam {

	public static void main(String[] args) {
		// A 객체 생성
		A a = new A();
		a.method();
		
		// B 객체 생성
		A.B b = a.new B();
		b.ShowBS();
		
	}

}
