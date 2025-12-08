package week06;

public class Q8 {

	public static void main(String[] args) {
		int [][] array = { 
	            {95,85}, 
	            {83, 92, 96}, 
	            {78, 83, 93, 87, 88} 
	        };

	        // 1. ?©ê³„?€ ?„ì²´ ?”ì†Œ ê°œìˆ˜ë¥??€?¥í•  ë³€??ì´ˆê¸°??
	        int sum = 0;
	        int count = 0;
	        
	        // 2. ?¸ë? forë¬? ??row) ë°˜ë³µ
	        // array.length???„ì²´ ?‰ì˜ ê°œìˆ˜ (?¬ê¸°?œëŠ” 3)
	        for (int i = 0; i < array.length; i++) {
	            
	            // 3. ?´ë? forë¬? ??column) ë°˜ë³µ
	            // array[i].length???„ì¬ ??i)???”ì†Œ ê°œìˆ˜ (ê°ê° 2, 3, 5)
	            for (int j = 0; j < array[i].length; j++) {
	                
	                // ?„ì¬ ?”ì†Œ??ê°’ì„ sum???”í•¨
	                sum += array[i][j];
	                
	                // ?”ì†Œê°€ ?˜ë‚˜ ì²˜ë¦¬???Œë§ˆ??countë¥?1 ì¦ê??œí‚´
	                count++;
	            }
	        }
	        
	        // 4. ?‰ê·  ê³„ì‚°
	        // ?•í™•???‰ê· ???„í•´ double ?€?…ìœ¼ë¡?ê³„ì‚°
	        double average = (double) sum / count;
	        
	        // 5. ê²°ê³¼ ì¶œë ¥
	        System.out.println("ë°°ì—´ ??ª©???„ì²´ ?©ê³„: " + sum);
	        System.out.println("ë°°ì—´ ??ª©???„ì²´ ê°œìˆ˜: " + count);
	        System.out.println("ë°°ì—´ ??ª©???„ì²´ ?‰ê· : " + average);
	}

}
