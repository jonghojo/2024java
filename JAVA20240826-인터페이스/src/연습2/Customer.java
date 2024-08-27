package 연습2;

public class Customer {
	
	int money = 2000;
	
	void buyCoffee(Coffee coffee) {
		if (money < coffee.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		else {
			money -= coffee.price;
			System.out.println(coffee + "를 구매했습니다");
		}
	}

}
