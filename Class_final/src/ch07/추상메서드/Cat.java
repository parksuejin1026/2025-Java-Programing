package ch07.추상메서드;

public class Cat extends Animal{
	// 추상 메서드 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
