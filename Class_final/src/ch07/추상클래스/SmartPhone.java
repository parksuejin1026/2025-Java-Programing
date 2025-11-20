package ch07.추상클래스;

public class SmartPhone extends Phone{
	// 생성자 선언
	SmartPhone(String owner) {
		// Phone 생성자 호출
		super(owner);
	}
	
	// 메서드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
