package ch09;

public class Car {
	private String model;
	private Engine engine; // Engine ?´ë˜???¸ì¶œ
	
	public Car(String model, int horsePower) { // horsePower???´ìœ ??Engine?ì„œ???„ë“œëª…ì´ê¸??Œë¬¸
		this.model = model;
		this.engine = new Engine(horsePower); // ?ì„±?ë? ?ì„± ?????ˆì—???ì„±?ë? ë§Œë“œ???ë‚Œ
	} 
	
	public void start() {
		System.out.println(model + " ?œë™??ê²ë‹ˆ??");
		engine.run();
	}
	
	public void stop() {
		System.out.println(model + " ?œë™???•ë‹ˆ??");
	}
	
	private class Engine {
		private int horsePower;
		
		public Engine(int horsePower) {
			this.horsePower = horsePower;
		}
		
		public void run() {
			System.out.println("?”ì§„??ê°€??ì¤‘ì…?ˆë‹¤! (" + horsePower + "ë§ˆë ¥)");
		}
	}

}
