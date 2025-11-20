package ch07.추상클래스;

public class PhoneExam {

	public static void main(String[] args) {
		// 생성자 명명
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
