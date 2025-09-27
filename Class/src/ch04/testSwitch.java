package ch04;
import java.util.Scanner;
public class testSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ival_1, ival_2;
		String sOperator;
		
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		ival_1 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요 : ");
		sc.nextLine();
		sOperator = sc.nextLine();
		
		System.out.print("두 번째 정수를 입력해주세요 : ");
		ival_2 = sc.nextInt();
		
		switch(sOperator) {
		case "+" :
			System.out.println("ival_1 + ival_2 = " + (ival_1 + ival_2));
		case "-" :
			System.out.println("ival_1 - ival_2 = " + (ival_1 - ival_2));
		case "*" :
			System.out.println("ival_1 + ival_2 = " + (ival_1 * ival_2));
		case "/" :
			System.out.println("ival_1 + ival_2 = " + (ival_1 / ival_2));
		}
	}

}
