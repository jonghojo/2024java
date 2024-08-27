package 연습;

public class CreditCardPayment implements Payment{

	@Override
	public void makePayment(String amount) {
		
		System.out.printf("신용카드로 %s원을 결제합니다.\n", amount);
		
	}

}
