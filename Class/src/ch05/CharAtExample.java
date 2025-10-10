package ch05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "0106241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
		
		
		//=========================================
		String str = "CharAtExample_Test1";
		String s1 = str.substring(12);
		System.out.printf("s1 :  %s\n", s1);
		String s2 = str.substring(12,15);
		System.out.printf("s2 : %s\n",s2);
		
		//==========================================
		String str2 = "CharAtExample_Test2";
		int a1 = str2.indexOf('E');
		System.out.printf("a1 : %d\n", a1);
		}
	}


