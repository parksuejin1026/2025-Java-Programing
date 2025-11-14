package Ch09.Calc;

public class calc {

	public static void main(String[] args) {
		Operation op = new Operation();
		op.start();
		
		op.add(10, 3);
		op.subtract(10, 2);
		op.multiply(23, 2);
		op.divide(10100, 2);
		op.finish();
		
		
	}

}
