package ch05;

public class 참조타입의초기화 {

	public static void main(String[] args) {
		int[] intarr = null;
		
		String str1 = null;
		
		String str2 = null;
		
		System.out.println("str1 == str2 : " + str1 == str2);
		
		String var1 = "java";
		String var2 =  null;
		String var3; 
		String var4 = null;
		String var5 = null;
		String var6 = null;
		
		System.out.println(var1 == var4);
		System.out.println(var5 == var6);
	}

}
