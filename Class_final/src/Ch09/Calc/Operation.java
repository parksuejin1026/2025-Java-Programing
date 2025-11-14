package Ch09.Calc;

public class Operation {
	
	public void add(int a, int b) {
		System.out.println("덧셈 결과 : " + (a + b));
	}
	
	public void subtract(int a, int b) {
		System.out.println("뺄셈 결과 : " + (a- b) );
	}
	
	public void multiply(int a, int b) {
		System.out.println("곱셈 결과 : " + (a*b));
	}
	
	public void divide(int a, int b) {
		if (b != 0) 
			System.out.println("나눗셈 결과 : "  + ((double) a/b));
		else
			System.out.println("0으로 나눌 수 없습니다.");
	}	
	
	public void start() {
		System.out.println("계산을 시작하겠습니다.");
	}
	
	public void finish() {
		System.out.println("계산을 종료하겠습니다.");
	}
}
