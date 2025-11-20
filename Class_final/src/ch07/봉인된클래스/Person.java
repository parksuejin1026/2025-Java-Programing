package ch07.봉인된클래스;

public sealed class Person permits Employee, Manager {
	// 필드
	public String name;
	
	// 메서드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
