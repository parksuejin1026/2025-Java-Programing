package week11;

public class Test2 {

	public static void main(String[] args) {
		// 1 ~ 100 ?«ì ì¤?7??ë°°ìˆ˜ë¥?ëª¨ë‘ ì¶œë ¥?˜ê³ , ëª¨ë‘ ëª?ê°œì¸ì§€ ?œì‹œ ?˜ì‹œ??
		int count = 0;
		for ( int i = 1 ; i <= 100 ; i ++ ) {
			if ( i % 7 == 0) {
				System.out.printf("%d \t", i);
				count ++;
				if( count % 10 == 0 ) {
					System.out.println();
				}
			} else continue;
		} 
		System.out.printf("\n -- 1 ~ 100ì¤?7??ë°°ìˆ˜??ì´?%dê°? --", count );
	}

}
