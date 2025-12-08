package week05;

import java.util.Scanner;
import java.util.Random;

public class upDownGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int target = r.nextInt(100) + 1; // 1 to 100
        int count = 0;

        System.out.println("Up/Down 게임을 시작합니다. 1~100 사이의 숫자를 맞춰주세요.");

        while (true) {
            System.out.print("숫자 입력: ");
            int guess = sc.nextInt();
            count++;

            if (guess > target) {
                System.out.println("Down!");
            } else if (guess < target) {
                System.out.println("Up!");
            } else {
                System.out.println("정답입니다! " + count + "회 만에 맞췄습니다.");
                break;
            }
        }
        sc.close();
    }
}
