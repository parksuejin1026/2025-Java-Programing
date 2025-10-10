package ch05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		
		//=================================================
		String oldStr = "Java 문자열은 불변입니다. Java 문자열은 String입니다.";
		String newStr = oldStr.replace("Java", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
