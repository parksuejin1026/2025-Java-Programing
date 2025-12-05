package test1;

import java.util.Stack;

public class stackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		// push() 스택에 데이터 넣기
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("스택 내용" + stack);
		
		// peek() 맨 위에 있는 내용 출력 (삭제 X)
		System.out.println("peek" + stack.peek());
		
		// pop() 맨 위에 있는 내용 출력 (삭제 O)
		System.out.println("pop1" + stack.pop());
		System.out.println("pop2" + stack.pop());
		
		System.out.println("스택이 비었나요 ? : " + stack.isEmpty());
		
		System.out.println("남은 요소 확인" + stack);
		}

}
