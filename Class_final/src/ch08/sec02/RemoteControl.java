package ch08.sec02;

public interface RemoteControl {
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// 필드 선언 인터페이스에서 선언한 필드는 모두 
	// public static final의 특성을 가진다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	default void setMute(boolean mute) {
	}
	
	static void changeBattery() {
		System.out.println("Change Battery Start !!!");
	}
}
	
