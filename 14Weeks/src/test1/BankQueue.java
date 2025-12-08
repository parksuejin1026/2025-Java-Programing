package test1;

import java.util.Queue;
import java.util.LinkedList;

public class BankQueue extends Customer{
	
	Queue<Customer> Q = new LinkedList<>();
	
	BankQueue(String name, String JobList) {
		super(name, JobList); // 상속받은 Customer 클래스의 생성자 호출
		
	}

	void addCustomer(Customer c) {
		
	}
	
	void nextCustomer() {
		Q.poll(c.name);
	}
}
