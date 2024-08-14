package ex05;

import java.util.Scanner;

public class operation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력>> ");
		
		int age = sc.nextInt();
		
		int fee = 2000;
		double rate = 0;
		
		if (age >= 1 && age <=5) {
			rate = 0;
		}
		else if(age >= 6 && age <=12) {
			rate = 0.5;
		}
		else if(age >= 13 && age <=18) {
			rate = 0.75;
		}
		else if(age >= 19 && age <=64) {
			rate = 1;
		}
		else {
			rate = 0;
		}
	    int result = (int)(fee*rate);
		System.out.printf("나이 : %d, 버스요금 :" + "%d원\n" , age, result);
		
//		int age = (int)(Math.random()*100)+1;
//		
//		int fee = 2000;
//		double rate = 0;
//		
//		if(age >=65 || age <=5) {
//			rate = 0;
//		}
//		else if(age >=6 && age <=12) {
//			rate = 0.5;
//		}
//		else if(age >=13 && age <=18) {
//			rate = 0.75;
//		}
//		else if(age >=19 && age <=64) {
//			rate = 1;
//		}
//		int result = (int)(fee * rate);
//		System.out.printf("나이 : %d, 버스요금 : " + "%d원\n" , age, result);

	}

}
