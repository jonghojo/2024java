package Ex08;

public class Item {
	private String name;
	int price;
	
	public Item() {}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.printf("이름:%s, 가격:%d\n", name, price);
	}
	
	int getprice() {
		return price;
	}
	
}
