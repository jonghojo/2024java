package 연습;

public class Main {

	public static void main(String[] args) {
		
		Payment c = new CreditCardPayment();
		c.makePayment("10,000");;
		
		c = new CashPayment();
		c.makePayment("10,000");
		
		c = new PayPalPayment();
		c.makePayment("50,000");
		
	}

}
