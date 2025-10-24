package ch07;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.err.println();
		
		computer computer = new computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}

}
