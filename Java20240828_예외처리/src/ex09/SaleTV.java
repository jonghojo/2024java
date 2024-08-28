package ex09;

public class SaleTV extends TV{
	
	private int price;
	
	@Override
	public String toString() {
		return super.toString("판매상품정보 : 모델명(SALETV-1), 가격(300,000원), 크기(40)");
	}
	
	public SaleTV() {}
	
	public SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("구매 티비 채널 %d번의 프로를 플레이 합니다.", getChannel());
	}
	
	public void sale() {
		System.out.printf(getModel() + "모델의 상품을 판매합니다" , "%.8d", price);
	}
	
	@Override
	public String toString() {	
		return "판매상품정보 : 모델명("+ getModel()+"), 가격("+ String.format("%,d",price) +"원), 크기("+getSize()+")";
	}
	
}
