package Ch09.Bank;

public class BankExam {

	public static void main(String[] args) {
		Bank.Account acc1 = new Bank.Account("홍길동", 10000);
		Bank.Account acc2 = new Bank.Account("이영희", 5000);
		
		acc1.showInfo();
		acc2.showInfo();
		
		acc1.deposit(30000);
		acc2.deposit(40000);
		
		acc1.showInfo();
		acc2.showInfo();
	}

}
