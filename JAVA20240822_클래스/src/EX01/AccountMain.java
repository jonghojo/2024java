package EX01;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		System.out.println("계좌에 10000원을 입금합니다.");
		account.deposit(10000);
		
		System.out.println("계좌에서 9000원을 출금합니다.");
		account.withdraw(9000);
		
		System.out.println("계좌에서 2000원을 출금합니다.");
		account.withdraw(2000);
		
		System.out.println("현재잔고: 1000");
		System.out.printf("잔액 :%d\n", account.getBalance());
	}

}
