package ch04;
import java.util.Scanner;
public class moreThan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("intX의 정수를 입력해주세요 : ");
		int intX = sc.nextInt();
		
		System.out.print("intX의 정수를 입력해주세요 : ");
		int intY = sc.nextInt();
		
		if (intX > intY) {
			System.out.print(intX + " > " + intY );
		} else if (intX < intY){
			System.out.println(intX + " < " + intY);
		} else  {
			System.out.println(intX + " = " + intY);
		}
	}
}