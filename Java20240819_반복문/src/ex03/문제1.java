package ex03;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		boolean run = true;
//		
//		while(run) {
//			System.out.println("-----------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("-----------------------------");
//			System.out.print("선택 :");
//			
//			int num = sc.nextInt();
//			
//			if(num == 1) {
//				int A = 10000;
//				System.out.println("예금액 :" + A);
//			}
//			
//			else if(num == 2) {
//				int B = 2000;
//				System.out.println("출금액 :" + B);
//			}
//			else if(num == 3) {
//				int C = 8000;
//				System.out.println("잔고 :" + C);
//			}
//			else if(num == 4) {
//				 run = false;
//			}
//		}
//		
//		System.out.println("프로그램 종료");
		boolean run = true;
		
		while(run) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		System.out.print("선택 :");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("예금 :" + 10000);
			break;
		case 2:
			System.out.println("출금 : " + 2000);
			break;
		case 3:
			System.out.println("잔고 :" + 8000);
			break;
		case 4:
			System.out.println("프로그램 종료");
			run = false;
			break;
		}
		}

	}

}
