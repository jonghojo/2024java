package ex04;

import java.util.Scanner;

/*
 * 이클립스 단축키
 * 줄복사: ctrl + alt + 상,하 방향키
 * 줄삭제: ctrl + D
 * 줄이동: alt + 상,하 방향키
 * 창 분할: ctrl + shift + [
 * 화면확대: ctrl + m
 * 주석: ctrl+/
 */

public class 중괄호블럭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; //변수선언
		n = 200;
		int num = 10;
		int num2 = 20;
		int num3 = 30;
		{
			//블럭 안 내용은 블럭 내에서 만 사용가능
			System.out.println(num);
		}
		
		
		{
			System.out.println(num2);
		}
		
		    
		{
			System.out.println(num3);
		}
		
		Scanner sc = new Scanner(System.in);
				
		String line = sc.nextLine();
		
		System.out.println(line);
		
		int number = sc.nextInt(); //정수만 입력하기
		System.out.println(number);
		
		
	}

}
