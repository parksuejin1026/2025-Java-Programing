package ch06;

public class Car3 {
	//필드 선언
		String company = "현대자동차";
		String model = "그랜저";
		String color = "검정";
		int maxSpeed = 350;
		
		Car3(String model){
			this(model, "은색", 250);
		}
		
		Car3(String model, String color){
			this(model, color, 250);
		}
		
		Car3(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		
}
}