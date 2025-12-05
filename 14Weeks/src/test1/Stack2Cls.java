package test1;

import java.util.Stack;
import java.util.ArrayList;


public class Stack2Cls {
	// 필드
	private final int MAX_SIZE = 10;
	private String[] stackArr;
	private int top;
	
	// 생성자
	Stack2Cls() {
		stackArr = new String[10];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == MAX_SIZE - 1);
	}
	
	
	public void push(String x) {
		if (isFull()) {
			System.out.println("Full 입니다.");
			return;
		}
		top++;
		stackArr[top] = x;
		System.out.println("push(" + x + ")" );
	}
	
	public String pop() {
		String data = stackArr[top];
		top--;
		System.out.println("pop() : " + data);
		return data;
	}
	
	public String peek() {
		String data = stackArr[top];
		System.out.println("peek()" + data);
		return data;
	}
	


}
