package ch05;

import java.util.Scanner;

public class Calculator {
    
    // 1. enum Operator 정의
    public enum Operator {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. First Val: ");
        int num1 = scanner.nextInt();
        
        System.out.print("2. Second Val: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Insert Operator (PLUS, MINUS, MULTIPLY, DIVIDE): ");
        String opInput = scanner.nextLine().toUpperCase();
        
        Operator op = Operator.valueOf(opInput);
        
        double result = 0;

        switch (op) {
            case PLUS:
                result = num1 + num2;
                System.out.println("Result: " + (int)result);
                break;
            case MINUS:
                result = num1 - num2;
                System.out.println("Result: " + (int)result);
                break;
            case MULTIPLY:
                result = num1 * num2;
                System.out.println("Result: " + (int)result);
                break;
            case DIVIDE:
                // 3. 0으로 나누기 방지
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = (double) num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
        }
        scanner.close();
    }
}