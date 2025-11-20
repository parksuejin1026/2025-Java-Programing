package ch07;

public class CarExam {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new hankooktire();
		myCar.run();
		
		myCar.tire = new Kumhotire();
		myCar.run();
		
	}

}
