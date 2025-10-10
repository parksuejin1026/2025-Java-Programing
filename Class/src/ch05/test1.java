package ch05;

public class test1 {

	public static void main(String[] args) {
		String sTot = "10point,23point,33point,45point,55point,67point";
		
		String[] tokens = sTot.split(",");
		
		int Sum = 0;
		float Avg = 0f;
		
		for(int i=0; i<tokens.length; i++) {
			Sum += Integer.parseInt(tokens[i].replace("point",""));
		}
		
		Avg = (float)Sum / (float)tokens.length;
		
		System.out.println("1. TotCnt : " + tokens.length);
		System.out.println("2. SumValue : " + Sum);
		System.out.println("3. Avg : " + Avg);
	}

}
