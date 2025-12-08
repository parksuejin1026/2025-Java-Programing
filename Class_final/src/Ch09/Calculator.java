package ch09;

public class Calculator {
	public void calculate(int a, int b) {
		System.out.println("== 계산 ?�작 ==");
		
		final String operator = "?�셈";
		
		class Operation {
			public void add() {
				System.out.println(operator + " 결과 : " + (a + b));
			}
			
			public void subtract() {
				System.out.println("뺄셈 결과 : " + (a- b) );
			}
			
			public void multiply() {
				System.out.println("곱셈 결과 : " + (a*b));
			}
			
			public void divide() {
				if (b != 0) 
					System.out.println("?�눗??결과 : "  + ((double) a/b));
				else
					System.out.println("0?�로 ?�눌 ???�습?�다.");
			}	
		}
		Operation op = new Operation();
		op.add();
		op.subtract();
		op.multiply();
		op.divide();
		
		System.out.println("== 계산 종료 ==");
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator calc = new Calculator();
			calc.calculate(10, 3);
		}

	
	}

