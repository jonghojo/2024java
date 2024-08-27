package 연습2;

public class cafe {

	public static void main(String[] args) {
		
		Customer me = new Customer();
		me.buyCoffee(new Americano());
		me.buyCoffee(new CaffeLatte());
		
		System.out.println("현재 잔액 :" + me.money);

	}

}
