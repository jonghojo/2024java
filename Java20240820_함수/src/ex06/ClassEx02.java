package ex06;

import java.util.Scanner;

public class ClassEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		book 해 = new book();
		해.제목 = "해리포터";
		해.저자 = "롤링";
		해.가격 = 15000;
		해.재고수량 = 100;
		해.입고();
		해.판매();
		해.info();
		해.총판매금액();

	}

}


class book{

	int 판매 = 0;
	int 입고 = 0;
	int 총판매금액 =0;
	
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
//	int 판매누적수량;
	
	Scanner sc = new Scanner(System.in);
	
	void info() {
		System.out.printf("제목 :%s, 저자 :%s, 가격 :%d, 재고수량 :%d\n", 제목, 저자, 가격, 재고수량);
	}
	
	void 입고() {
		System.out.println("입고 :");
		입고 = Integer.parseInt(sc.nextLine());
		재고수량 += 입고;
	}
	
	void 판매() {
		System.out.println("판매 :");
		판매 = Integer.parseInt(sc.nextLine());
		총판매금액 += 판매*가격;
		재고수량 -= 판매;
//		판매누적수량 += 판매;
	}
	
	
	void 총판매금액() {
		System.out.println("총판매금액 :" + 판매*가격);
	}
	
	
	
}