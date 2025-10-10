package ch05;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }
        
        System.out.println("랜덤한 숫자 배열: " + Arrays.toString(numbers));
        
      
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                System.out.println("7 is " + (i + 1) + "th Number.");
            }
        }
    }
}