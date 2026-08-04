package Day07.Ex15_사용자정의예외;

public class Bank {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		// 10000 입금
		account.deposit(10000);
		
		// 20000 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
			System.err.println("예외발생!");
		}
	}

}
