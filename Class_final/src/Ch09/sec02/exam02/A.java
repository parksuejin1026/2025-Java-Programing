package Ch09.sec02.exam02;

public class A {
	// 인스턴스 맴버 클래스
	class B {
		// 인스턴스 필드
		int field1 = 1;
		
		// 정적 필드 (Java17부터 허용)
		static int field2 = 2;
		
		// 생성자
		B() {
			System.out.println("B - 생성자 실행");
		}
		
		// 인스턴스 메서드
	}
}
