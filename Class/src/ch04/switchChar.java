package ch04;

public class switchChar {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a': // 이건 너무 비효율적
			System.out.println("우수 회원입니다.");
		case 'B','b': // 이렇게 하는 게 더 좋음
			System.out.println("일반 회원입니다.");
		default : 
			System.out.println("손님입니다.");
			}
		
	}

}
