package ex09;

public class TVTest {

	public static void main(String[] args) {
		SaleTV sale = new SaleTV();
		RentalTV rent = new RentalTV("RENTALTV-10", 42, 1);
		sale.channelUp();
		sale.channelUp();
		rent.channelDown();
		rent.channelDown();
		rent.channelDown();
		
		TVTest.printAllTV(sale);
		TVTest.printRentalTV(rent);
	}
	
	static void printAllTV(TV tv) {
		System.out.println();
	}
	
	static void printRentalTV(Rentable tv) {

	}

}
