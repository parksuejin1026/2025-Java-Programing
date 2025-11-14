package Ch09.Bank;

public class Bank {
	private static String bankName = "우리은행";
	
	// 정적 멤버 클래스
	public static class Account {
		private String owner;
		private int balance;
		
		public Account(String owner, int balance) {
			this.owner = owner;
			this.balance = balance;
		}
		
		public void deposit(int amount) {
			balance += amount;
			System.out.println(owner + "님 입금 완료! 잔액 : " + balance + "원");
		}
		
		public void withdraw(int amount) {
			if (balance < amount) {
				System.out.println("잔액 부족 ! 출금 실패!");
			} else {
				balance -= amount;
				System.out.println(owner + "님 출금 완료 ! 잔액 : " + balance + "원");
			}
		}
		public void showInfo() {
			System.out.println("은행명 : " + bankName);
			System.out.println("예금주 : " + owner);
			System.out.println("현재 잔액 : " + balance + "원");
			System.out.println();
		}
	}
}
