package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		Ltab ltab = new Ltab("Ltab", 500, "ABC-01");
		Otab otab = new Otab("Otab", 1000, "XYZ-20");
		
		Mobile mobile2 = new Mobile();
		Ltab ltab2 = new Ltab("Ltab", 500, "ABC-01");
		Otab otab2 = new Otab("Otab", 1000, "XYZ-20");
		
		Mobile mobile3 = new Mobile();
		Ltab ltab3 = new Ltab("Ltab", 600, "ABC-01");
		Otab otab3 = new Otab("Otab", 1080, "XYZ-20");
		
		mobile.info();
		ltab.info();
		otab.info();
		
		System.out.println();
		System.out.println("[10분 충전]");
		
		mobile2.charge(0);
		ltab2.charge(10);
		otab2.charge(10);
		
		System.out.println();
		System.out.println("[5분 통화]");
		
		mobile3.operate(0);
		ltab3.operate(5);
		otab3.operate(5);
	}

}
