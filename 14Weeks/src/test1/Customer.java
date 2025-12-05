package test1;

public class Customer {
	// 필드
	String name;
	String JobList;
	
	// 생성자
	Customer(String name, String JobList) {
		this.name = name;
		this.JobList = JobList;
	}
	
	public void Showinfo(Customer c) {
		System.out.println("JobList : " + c.JobList);
	}
	
	
}
