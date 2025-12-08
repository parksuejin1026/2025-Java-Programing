package week04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1.?ˆê¸ˆ | 2.ì¶œê¸ˆ | 3.?”ê³  | 4.ì¢…ë£Œ");
            System.out.println("---------------------------------");
            System.out.print("? íƒ> ");

            try { // [?˜ì •] ?«ìë¡?ë³€????ë°œìƒ?????ˆëŠ” ?ëŸ¬???€ë¹?
                String strChoice = scanner.nextLine();
                int choice = Integer.parseInt(strChoice);

                switch (choice) {
                    case 1: // ?ˆê¸ˆ
                        System.out.print("?ˆê¸ˆ?? ");
                        try { // [?˜ì •] ?ˆê¸ˆ???…ë ¥ ?œì—???ëŸ¬ ?€ë¹?
                            int deposit = Integer.parseInt(scanner.nextLine());
                            if (deposit > 0) { // [ì¶”ê?] 0ë³´ë‹¤ ??ê¸ˆì•¡ë§??…ê¸ˆ
                                balance += deposit;
                            } else {
                                System.out.println("0ë³´ë‹¤ ??ê¸ˆì•¡???…ë ¥?´ì£¼?¸ìš”.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ê¸ˆì•¡?€ ?«ìë¡œë§Œ ?…ë ¥?´ì£¼?¸ìš”.");
                        }
                        break;

                    case 2: // ì¶œê¸ˆ
                        System.out.print("ì¶œê¸ˆ?? ");
                        try { // [?˜ì •] ì¶œê¸ˆ???…ë ¥ ?œì—???ëŸ¬ ?€ë¹?
                            int withdraw = Integer.parseInt(scanner.nextLine());
                            if (withdraw <= 0) { // [ì¶”ê?] 0ë³´ë‹¤ ??ê¸ˆì•¡ë§?ì¶œê¸ˆ
                                System.out.println("0ë³´ë‹¤ ??ê¸ˆì•¡???…ë ¥?´ì£¼?¸ìš”.");
                            } else if (balance < withdraw) {
                                System.out.println("?”ê³ ê°€ ë¶€ì¡±í•©?ˆë‹¤.");
                            } else {
                                balance -= withdraw;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ê¸ˆì•¡?€ ?«ìë¡œë§Œ ?…ë ¥?´ì£¼?¸ìš”.");
                        }
                        break;

                    case 3: // ?”ê³  ì¡°íšŒ
                        System.out.println("?”ê³ > " + balance);
                        break;

                    case 4: // ì¢…ë£Œ
                        run = false;
                        break;

                    default: // ë©”ë‰´???†ëŠ” ë²ˆí˜¸ë¥?? íƒ?ˆì„ ê²½ìš°
                        System.out.println("ë©”ë‰´???ˆëŠ” ë²ˆí˜¸ë¥?? íƒ?´ì£¼?¸ìš”.");
                        break;
                }
            } catch (NumberFormatException e) { // [?˜ì •] ë¬¸ìë¥??…ë ¥?ˆì„ ?Œì˜ ì²˜ë¦¬
                System.out.println("ë©”ë‰´ ? íƒ?€ ?«ìë¡œë§Œ ?…ë ¥?´ì£¼?¸ìš”.");
            }
        }

        System.out.println("?„ë¡œê·¸ë¨ ì¢…ë£Œ");
        scanner.close();
    }
}
