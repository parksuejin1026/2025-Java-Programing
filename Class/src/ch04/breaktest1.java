package ch04;

public class breaktest1 {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			count++;
			if(num == 6) {
				break;
			}
		}
		System.out.printf("프로그램 종료 총 %d번만에 6이 나왔습니다.",count);
	}

}
