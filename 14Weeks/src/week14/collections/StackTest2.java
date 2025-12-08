package week14.collections;

import java.util.Stack;
import java.util.Scanner;

public class StackTest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String s = " ";

        System.out.println("문자열을 입력하세요 (q to quit):");

        while (true) {
            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            stack.push(input);
            s += input;
        }
        System.out.println("================================");
        System.out.println(s);

        while (!stack.isEmpty()) {
            stack.pop();
        }

        sc.close(); // Fixed resource leak
    }

}
