package ch08.sec08;

public class Multi {

	public static void main(String[] args) {
		// 다중인터페이스
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable sr = new SmartTelevision();
		
		sr.search("https://www.youtube.com");
	}

}
