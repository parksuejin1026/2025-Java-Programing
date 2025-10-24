package ch07.추상메서드;

public class 추상메서드실습 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수의 다형성
		animalsound(new Dog());
		animalsound(new Cat());
	}

	public static void animalsound( Animal animal ) {
		animal.sound();
	}
}
