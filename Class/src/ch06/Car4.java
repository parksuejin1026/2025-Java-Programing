package ch06;

public class Car4 {
	
	int speed;
	
	void run() {
		System.out.println(speed + "로 달립니다.");
	}
	
	static void simulate() {
		//this.speed = 10;
		//speed = 20;
	
	
		Car4 myCar = new Car4();
	
			myCar.speed = 200;
			myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car4 myCar = new Car4();
		
		myCar.speed = 60;
		myCar.run();
	}

}
