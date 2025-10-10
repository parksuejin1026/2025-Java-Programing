package ch05;

enum Season { 
	Spring,
	Summer,
	Fall,
	Winter
}
public class EnumExample {
	public String sAbbr;
	public Season sFavoriteSeason;
	
	public static void main(String[] args) {
		EnumExample season = new EnumExample();
		season.sAbbr = "Win";
		season.sFavoriteSeason = Season.Winter;
		
		System.out.println("ABBR : " + season.sAbbr);
		System.out.println("Full Name : " + season.sFavoriteSeason);
	}

}
