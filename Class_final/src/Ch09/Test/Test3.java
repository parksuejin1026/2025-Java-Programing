package Ch09.Test;

public class Test3 {

	public static void main(String[] args) {
		int[] secret = new int[3];
		for( int i = 0 ; i < 3 ; i ++ ) {
			while (true) {
				int num = (int)(Math.random()*10);
				boolean dup = false;
				for (int j = 0 ; j < i ; j ++ ) {
					if (secret[j] == num ) dup = true;
				}
				if (!dup) {
					secret[i] = num;
					break;
				}
			}
		}
	}

}
