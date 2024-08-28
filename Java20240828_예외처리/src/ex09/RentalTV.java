package ex09;

public class RentalTV extends TV implements Rentable{
	
	int price;
	
	public RentalTV () {}
	
	public String toString() {
		super.toString("대여상품정보 : 모델명(RENTALTV-1), 가격(100,000원), 크기(42)");
	}
	
	public RentalTV (String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 티비 채널 %d번의 프로를 플레이 합니다.", getChannel());
	}
	//string.format은 앞의 입력을무시하고 새로운값을 입력한다
	
	@Override
	public String toString() {	
		return "대여상품정보 : 모델명 ("+ getModel()+"), 가격 ("+ String.format("%,8d",price) +" 원 ), 크기 ("+getSize()+")";
	}
	

}
