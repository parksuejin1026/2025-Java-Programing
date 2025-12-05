package test1;

import java.util.Stack;
import java.util.Scanner;

public class stackTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <String> stack = new Stack<>();
		String s = " ";
		while(true) {
			String input = sc.next();
			stack.push(input);
			if(input.equals("q")) {
				break;
			}
			s += input;
		}
		System.out.println("================================");
		System.out.println(s);
		for (int i = 0 ; i < stack.size();  i ++) {
			stack.pop();
		}
		
		
	

	}

}
