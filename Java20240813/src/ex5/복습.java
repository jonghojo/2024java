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
			
			int count = 0;
			
			System.out.println("1번째 정수입력 :");
			
			int num1 = sc.nextInt();
			
			count = count + 1;
			
	        System.out.println("2번째 정수입력 :");
			
			int num2 = sc.nextInt();
			
			count = count + 1;
			
			int sum = num1 + num2;
			
			double avg = sum/(double)count;
			
			System.out.println("수의 합 :" + sum +" , 수의 평군 :" + avg);
		}
	}

}
