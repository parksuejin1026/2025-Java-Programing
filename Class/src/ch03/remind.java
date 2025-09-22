package ch03;
import java.util.Scanner; // 스캐너 연습 파이썬에서 input임

public class remind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("input Val : ");
		String strX = sc.nextLine(); // Scanner는 처음 타입이 문자열이기 때문에 String사용
		int x = Integer.parseInt(strX); // 형변환을 사용해 int로 변경
		// System.out.print("1. input Val : ");
		// x = sc.nextInt(); 로도 간단하게 사용 가능 대신에 입력값을 무조건 int로만 float x
		
		System.out.print("input Val : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		System.out.printf("iVal_1 + iVal_2 = %d", x + y);
		
	}

}
