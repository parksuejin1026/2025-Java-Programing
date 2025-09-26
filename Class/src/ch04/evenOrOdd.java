package ch04;
import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int intX = sc.nextInt();
		
		if (intX % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

}
