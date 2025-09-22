package ch03.sec02;

public class test1 {

	public static void main(String[] args) {
		int apple = 123;
		int bs = 0;
		int result1 = apple / 10;
		bs += result1;
		int result2 = apple % 10; 
		if(result2 != 0)
			System.out.println(++bs);
		else
			System.out.println(bs);
		System.out.println("바구니의 개수는" +bs+"개다.");
	}

}
