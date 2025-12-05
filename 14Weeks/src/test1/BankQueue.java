package test1;

import java.util.Queue;
import java.util.LinkedList;

public class BankQueue extends Customer{
	
	Queue<Customer> Q = new LinkedList<>();
	
	BankQueue(String name, String JobList) {
		super(name, JobList);
		
	}

	void addCustomer(Customer c) {
		
	}
	
	void nextCustomer() {
		Q.poll(c.name);
	}
}
