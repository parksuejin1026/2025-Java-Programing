package Ch09.sec03;

public class AExam {

	public static void main(String[] args) {
		// B 객체 생성 및 인스턴스 필드 및 메서드 사용
		A.SubB b = new A.SubB();
		System.out.println(b.field1);
		b.method1();
		
		// B 클래스의 정적 필드 및 메서드 사용
		System.out.println(A.SubB.field2);
		A.SubB.method2();
		
	}

}
