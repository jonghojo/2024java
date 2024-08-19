package ex01;

import java.util.Scanner;

public class Functionex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1(); //함수 호출
		
		
		func2(24);
		
		
		int n =func3(27);
		//리턴타입
		if(n==1) System.out.println("홀수");
		else System.out.println("짝수");
		
		String n1 = func4(70);
	
		System.out.println(n1);
	}
	static String func4(int num)
	{
		if(num >= 90)
			return "A";
		else if(num >=80)
			return "B";
		else if(num >=70)
			return "C";
		else if(num >=60)
			return "D";
		else
			return "F";
	}
	//변환타입있고, 입력있는경우
	static int func3(int num){//static int func:메소드명, (int num):매개변수
		if(num % 2 == 0)
			return 0; // 짝수 리턴값 지정
		else
			return 1;//홀수
	}
	
	//변환타입X, 입력있는경우
	static void func2(int num) {
		if(num % 2 == 0)
			System.out.println("입력값은 짝수");
		else
			System.out.println("입력값은 홀수!");
	}
	
	
	//     void : 반환타입 , 함수명 :func1, 매개변수:() (리턴값이 없는경우는 void)
	static void func1() { //준비된 함수
		System.out.println("매개변수(함수에게 값 입력하지 않는다) , 반환타입 없는 함수");
	}
	}


