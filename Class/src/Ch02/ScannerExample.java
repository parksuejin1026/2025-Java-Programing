package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x ê°??…ë ¥: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y ê°??…ë ¥: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.printf("xê°’ì? : %d yê°’ì? : %d\n", x, y);
		
		while(true) {
			System.out.print("?…ë ¥ ë¬¸ì?? ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("ì¶œë ¥ ë¬¸ì?? " + data);
			System.out.println();
		}
		
		System.out.printf("ì¢…ë£Œ");
		
		

	}

}
