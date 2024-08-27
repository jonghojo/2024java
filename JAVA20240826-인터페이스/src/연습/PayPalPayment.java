package 연습;

public class PayPalPayment implements Payment{

	@Override
	public void makePayment(String amount) {
		
		System.out.printf("PayPal로 %s원을 결제합니다.\n", amount);
		
	}

}
