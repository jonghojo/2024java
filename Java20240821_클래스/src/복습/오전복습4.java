package 복습;

import java.util.Scanner;

public class 오전복습4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int 입금 = 0;
		int 출금 = 0;
		int 잔액 = 0;
		
		
		boolean run = true;
		while(run) {
			System.out.println("1.입금 | 2.출금 | 3.예금액 | 4.종료");
			System.out.println("번호를 선택하세요 :");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				System.out.println("입금액 :");
				
			}
		}
	}

}
