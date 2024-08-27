package 연습;

public class CashPayment implements Payment{

	@Override
	public void makePayment(String amount) {
		
		System.out.printf("현금으로 %s원을 결제합니다.\n", amount);
		
	}

}
