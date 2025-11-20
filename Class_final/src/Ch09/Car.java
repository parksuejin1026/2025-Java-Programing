package Ch09;

public class Car {
	private String model;
	private Engine engine; // Engine 클래스 호출
	
	public Car(String model, int horsePower) { // horsePower인 이유는 Engine에서의 필드명이기 때문
		this.model = model;
		this.engine = new Engine(horsePower); // 생성자를 생성 할 때 안에서 생성자를 만드는 느낌
	} 
	
	public void start() {
		System.out.println(model + " 시동을 겁니다.");
		engine.run();
	}
	
	public void stop() {
		System.out.println(model + " 시동을 끕니다.");
	}
	
	private class Engine {
		private int horsePower;
		
		public Engine(int horsePower) {
			this.horsePower = horsePower;
		}
		
		public void run() {
			System.out.println("엔진이 가동 중입니다! (" + horsePower + "마력)");
		}
	}

}
