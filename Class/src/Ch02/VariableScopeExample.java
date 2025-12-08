package ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			System.out.print("ê²°ê³¼??: " +  v2);
		}
		// int v3 = v1 + v2 + 5 // error v2??ê°’ì? if ?¨ìˆ˜ ?ˆì—?œë§Œ ?œì •??ë³€???¬ìš© ë²”ìœ„

	}

}
