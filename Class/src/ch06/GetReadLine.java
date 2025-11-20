package ch06;
import java.util.Scanner;
public class GetReadLine {
	Scanner sc = new Scanner(System.in);
	int scNum;
	
	int GetReadLineNo() {
		System.out.print("숫자를 입력해주세요 : ");
		scNum = sc.nextInt();
		return scNum;
	}
	}
