package week14.bank;

public class BankMainExec {

    public static void main(String[] args) {
        BankQueue bank = new BankQueue();

        bank.addCustomer(new Customer("홍길동", "예금"));
        bank.addCustomer(new Customer("김철수", "대출 상담"));
        bank.addCustomer(new Customer("이영희", "카드 발급"));

        System.out.println("현재 대기 인원: " + bank.getWaitingCount());

        System.out.println("--- 업무 처리 시작 ---");
        bank.nextCustomer();
        bank.nextCustomer();
        bank.nextCustomer();
        bank.nextCustomer(); // Empty check
    }

}
