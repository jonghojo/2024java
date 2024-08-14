package ex05;

import java.util.Scanner;

public class 체질량지수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double kg = 0;
		double m = 0;
		double bmi = 0;
		
		System.out.println("몸무게를 입력하세요 :");
		
		kg = sc.nextDouble();
		
		System.out.println("키를 입력하세요 :");
		
		m = sc.nextDouble();
		
		bmi = kg/(m*m);
		
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		}
		else if(bmi <=24.9) {
			result = "정상체중";
		}
		else if(bmi <=29.9) {
			result = "과체중";
		}
		else {
			result = "비만";
		}
		
		System.out.printf("bmi :%.1f\n", bmi);
		
		System.out.println(result + "입니다");

	}

}
