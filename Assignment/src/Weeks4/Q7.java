package Weeks4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");

            try { // [수정] 숫자로 변환 시 발생할 수 있는 에러에 대비
                String strChoice = scanner.nextLine();
                int choice = Integer.parseInt(strChoice);

                switch (choice) {
                    case 1: // 예금
                        System.out.print("예금액> ");
                        try { // [수정] 예금액 입력 시에도 에러 대비
                            int deposit = Integer.parseInt(scanner.nextLine());
                            if (deposit > 0) { // [추가] 0보다 큰 금액만 입금
                                balance += deposit;
                            } else {
                                System.out.println("0보다 큰 금액을 입력해주세요.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("금액은 숫자로만 입력해주세요.");
                        }
                        break;

                    case 2: // 출금
                        System.out.print("출금액> ");
                        try { // [수정] 출금액 입력 시에도 에러 대비
                            int withdraw = Integer.parseInt(scanner.nextLine());
                            if (withdraw <= 0) { // [추가] 0보다 큰 금액만 출금
                                System.out.println("0보다 큰 금액을 입력해주세요.");
                            } else if (balance < withdraw) {
                                System.out.println("잔고가 부족합니다.");
                            } else {
                                balance -= withdraw;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("금액은 숫자로만 입력해주세요.");
                        }
                        break;

                    case 3: // 잔고 조회
                        System.out.println("잔고> " + balance);
                        break;

                    case 4: // 종료
                        run = false;
                        break;

                    default: // 메뉴에 없는 번호를 선택했을 경우
                        System.out.println("메뉴에 있는 번호를 선택해주세요.");
                        break;
                }
            } catch (NumberFormatException e) { // [수정] 문자를 입력했을 때의 처리
                System.out.println("메뉴 선택은 숫자로만 입력해주세요.");
            }
        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}