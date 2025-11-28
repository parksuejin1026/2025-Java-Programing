package lesson;

public class Book {
	String auth;
	int fee;
	String title;
	
	Book(){
		
	}
	
	Book(String title, String auth) {
		title = this.title;
		auth = this.auth;
	}
	
	void setFee(int fee) {
		System.out.printf("대여료 : %d원", fee);
	}
}
