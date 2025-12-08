package ch09;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car("?Œë‚˜?€", 150);
		Car car2 = new Car("?„ë°˜??, 120);
		
		car1.start();
		car2.start();
		
		car1.stop();
		car2.stop();
	}

}
