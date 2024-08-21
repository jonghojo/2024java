package ex5;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{
//			Scanner sc = new Scanner(System.in);
//		
//			System.out.println("1번째 정수입력 :");
//		
//			int num1 = sc.nextInt();
//		
//        	System.out.println("2번째 정수입력 :");
//		
//			int num2 = sc.nextInt();
//		
//			int sum = num1 + num2;
//		
//			double avg = sum/2.0;
//		
//			System.out.println("수의 합 :" + sum +" , 수의 평군 :" + avg);
//		}

		{
			Scanner sc = new Scanner(System.in);
			
			double count = 0;
			
			System.out.println("1번째 정수입력 :");
			
			int num1 = sc.nextInt();
			
			count += 1;
			
	        System.out.println("2번째 정수입력 :");
			
			int num2 = sc.nextInt();
			
			count += 1;
			
			int sum = num1 + num2;
			
			double avg = sum/count;
			
//			System.out.println("수의 합 :" + sum +" , 수의 평군 :" + avg);
			System.out.printf("수의 합 :%d, 수의 평균 :%.2f\n", sum, avg); //avg는 실수이므로 %d가 아닌 %f를사용한다
		}
	}

}
