package week11;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 4ê°œì˜ ?•ìˆ˜ë¥??…ë ¥ ë°›ì•„ ???«ìë¶€??ì¶œë ¥?˜ì‹œ??
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[4];
		
		
		System.out.println("?•ìˆ˜ ?…ë ¥ ë°?ì¶œë ¥ ?„ë¡œê·¸ë¨");
		
		System.out.print("ì²?ë²ˆì§¸ ?«ìë¥??…ë ¥?´ì£¼?¸ìš”! -- ");
		numbers[0] = sc.nextInt();
		
		System.out.print("??ë²ˆì§¸ ?«ìë¥??…ë ¥?´ì£¼?¸ìš”! -- ");
		numbers[1] = sc.nextInt();
		
		System.out.print("??ë²ˆì§¸ ?«ìë¥??…ë ¥?´ì£¼?¸ìš”! -- ");
		numbers[2] = sc.nextInt();
		
		System.out.print("??ë²ˆì§¸ ?«ìë¥??…ë ¥?´ì£¼?¸ìš”! -- ");
		numbers[3] = sc.nextInt();
		
		sc.close();
		
		int n = numbers.length;
		int temp; // ê°?êµí™˜???„í•œ ?„ì‹œ ë³€??
		
		System.out.println("?…ë ¥?˜ì‹  ?«ìë¥??´ë¦¼ì°¨ìˆœ?¼ë¡œ ì¶œë ¥?˜ê² ?µë‹ˆ??");
		for (int i = 0 ; i < n - 1 ; i ++) { // ì´?3ë²ˆì„ ë°˜ë³µ?˜ì—¬ ???
			for (int j = 0 ; j < n - 1 - i ; j ++) {
				if (numbers[j] < numbers[j+1]) { // ?„ì¬ ê°’ì¸ (j)ê°€ ?¤ìŒ ê°?j+1)ë³´ë‹¤ ?‘ìœ¼ë©??¤í–‰
					temp = numbers[j]; // ?„ì‹œë³€?˜ì— ?‘ì? ê°??€??
					numbers[j] = numbers[j+1]; // ?„ì¬ ?¸ë±?¤ì— ??ê°??€??
					numbers[j+1] = temp; // ?¤ìŒ ?¸ë±?¤ì— ?‘ì? ê°??€??
				}
			}
		}
		
		// 3. ?•ë ¬??ë°°ì—´ (?´ë¦¼ì°¨ìˆœ) ì¶œë ¥
		System.out.print("???«ìë¶€??ì¶œë ¥ : ");
		for (int i = 0 ; i < n ; i++) {
			System.out.print(numbers[i]);
			
			// ë§ˆì?ë§??«ì ?¤ìŒ?ëŠ” ?¼í‘œë¥?ì°ì? ?Šë„ë¡?ì²˜ë¦¬
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(); 
		
		
	}

}
