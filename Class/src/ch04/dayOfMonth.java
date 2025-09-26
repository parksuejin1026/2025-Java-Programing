package ch04;

public class dayOfMonth {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+ 1;
		System.out.println(month + "월달");
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println("31일이 마지막날인 달입니다.");
			break;
		case 4,6,9,11:
			System.out.println("30일이 마지막날인 달입니다.");
			break;
		default:
			System.out.println("2월은 28일이 마지막날입니다.");
		
		}
	}

}

