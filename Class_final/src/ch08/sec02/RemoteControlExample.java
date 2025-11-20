package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// rc 변수에 Television 객체를 대입
		rc = new Television(); // Television의 Class를 가져오는 느낌 rc에 변수 대입 
		rc.turnOn(); // Class Television에서의 메서드 호출 
		rc.turnOff();
		rc.setVolume(5);
		// rc 변수에 Audio 객체를 대입
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(8);
		
		rc.setMute(true);
		System.out.println("----------------------");
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		
	}

		static void TurnOnDevice(RemoteControl rc) {
			rc.turnOn();
			System.out.println("Max Volume : " + rc.MAX_VOLUME);
			System.out.println("Min Volume : " + rc.MIN_VOLUME);
		}
}

		