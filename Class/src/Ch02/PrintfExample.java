package ch02;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("?í’ˆ??ê°€ê²?%d\n", value);
		System.out.printf("?í’ˆ??ê°€ê²?%6d\n", value);
		System.out.printf("?í’ˆ??ê°€ê²?%-6d\n", value);
		System.out.printf("?í’ˆ??ê°€ê²?%06d\n", value);
		
		double area = 3.141529 * 10 * 10;
		System.out.printf("ë°˜ì?ë¦„ì˜ ê¸¸ì´ê°€ %d???ì˜ ?ì´ : %10.2f\n" ,10 ,area);
		
		String name = "?ê¸¸??;
		String job = "?„ì ";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
