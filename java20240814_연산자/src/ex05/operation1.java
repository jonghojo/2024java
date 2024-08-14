package ex05;

import java.util.Scanner;

public class operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string 은 .equals 쓰기
		Scanner sc = new Scanner(System.in);
		System.out.println("계절입력>> ");
		
//		int wheather = sc.nextInt();
//		
//		String result = "";
//		
//		if (wheather == 12 || wheather == 1 || wheather == 2) {
//			result = "겨울";
//		}
//		
//		else if(wheather == 3 || wheather ==4 || wheather ==5) {
//			result = "봄";
//		}
//		
//		else if(wheather == 6 || wheather ==7 || wheather ==8) {
//			result = "여름";
//		}
//		
//		else if(wheather == 9 || wheather ==10 || wheather ==11) {
//			result = "가을";
//		}
//		
//		else {
//			result = "fale";
//		}
//		
//		System.out.println(result);
		
		String wheather = sc.nextLine();
		
		String result = "";
		
		if (wheather.equals("12월") || wheather.equals("1월") || wheather.equals("2월")) {
			result = "겨울";
		}
		
		else if(wheather.equals("3월") || wheather.equals("4월") || wheather.equals("5월")) {
			result = "봄";
		}
		
		else if(wheather.equals("6월") || wheather.equals("7월") || wheather.equals("8월")) {
			result = "여름";
		}
		
		else if(wheather.equals("9월") || wheather.equals("10월") || wheather.equals("11월")) {
			result = "가을";
		}
		
		else {
			result = "false";
		}
		
		System.out.println(result);

	}

}
