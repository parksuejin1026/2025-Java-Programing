package ch06;

public class rectexam {

	public static void main(String[] args) {
		rectangle myCalc = new rectangle();
		
		double result1 = myCalc.areaRect(10);
		
		double result2 = myCalc.areaRect(10,20);
		
		System.out.println("정사각형 넓이 : " +result1);
		System.out.println("직사각형 넓이 : " +result2);
	}

}
