package ch02;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"?ˆì†¡??"\n" +
				"}";
		
		String str2 = """
				{
					"id":"winter".
					"name":"?ˆì†¡??
					
				}
				""";
				
		System.out.println(str1);
		System.out.println("-----------------------");
		System.out.println(str2);
		System.out.println("-----------------------");
		String str = """
				?˜ëŠ” ?ë°”ë¥?\
				?™ìŠµ?©ë‹ˆ??
				?˜ëŠ” ?ë°” ê³ ìˆ˜ê°€ ??ê²ë‹ˆ??
				""";
		System.out.println(str);
		
		
	}

}
