package ch07;

public class SportsCar extends Car {
	
	// final 선언을 하지 않았기 때문에 오버라이드 가능
	@Override
	public void speedUp() {
		speed += 10;
	}
	// final 선언을 하여 오버라이드 불가능
	/* @Override 
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
