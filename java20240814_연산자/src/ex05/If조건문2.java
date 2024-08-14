package ex05;

import java.util.Scanner;

public class If조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>> ");
		
		int num = sc.nextInt();
		
		//삼항 연산지로 합격 불합격 판단
		
//		String result = (num>60) ? "합격" : "불합격";
//		System.out.println(result);
		
//		String result = "";
//		
//		if(num>=60) {
//			result = "합격";
//		}
//		
//		else {
//			result = "불합격";
//			
//		}
//		System.out.println(result);
		
		String result = "";
		
		if(num >= 90) {
			result = "A";
		}
		else if(num >= 80) {
			result = "B";
		}
		else if(num >= 70) {
			result = "C";
		}
		else {
			result = "F";
		}
		
		System.out.println(result);

	}

}
