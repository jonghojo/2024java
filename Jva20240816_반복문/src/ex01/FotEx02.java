package ex01;

import java.util.Scanner;

public class FotEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("양의 정수 입력 :");
//		
//      int num = sc.nextInt();
//		
//		int sum=0;
//		
//		for(int i=1; i<=num; i+=2)
//			sum += i;
//				
//		System.out.println("sum =" + sum);		

		System.out.println("양의 정수 입력 :");
		
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=0; i<=num; i++) {
			if(i % 2 == 1)
			sum += i;
		}
				
		System.out.println("sum =" + sum);
	}

}
