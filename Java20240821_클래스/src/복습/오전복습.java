package 복습;
import java.util.Scanner;

public class 오전복습 {
//60kg, 66kg, 73kg, 81kg, 90kg, 100kg, 100kg 이상
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double count = 0;
//		
//		System.out.println("num :");
//		int num = sc.nextInt();
//		count += 1;
//		
//		System.out.println("num2 :");
//		int num2 = sc.nextInt();
//		count += 1;
//		
//		int sum = num + num2;
//		
//		int result = sum;
//		
//		double avg = sum/count;
//		
//		System.out.printf("결과 값 :%d, 평균 값 :%.1f", result, avg);
		
		
//		int age = (int)(Math.random()*100)+1;
//
//		int fee = 50000;
//		double rate = 0;
//		
//		if(age <5 || age > 65)
//			rate = 0;
//		else if(age <=10)
//			rate = 0.3;
//		else if(age <=18)
//			rate = 0.7;
//		else
//			rate = 1;
		
//		double result = fee*rate;
//		System.out.printf("나이 :%d, 입장 금액: %.0f", age, result);
		
		System.out.println("양의 정수 입력:");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<=50; i++)
			if(i%3 == 0)
				sum += i;
		
		System.out.println("수의 합:" +sum);
		
	}

}
