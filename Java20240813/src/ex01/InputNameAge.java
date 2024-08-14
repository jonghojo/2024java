package ex01;

import java.util.Scanner;

/*
 * 나이하고 이름 입력
 */
class InputNameAge {

	public static void main(String[] args) {
		/*
		 * 기본자료형 -> 
		 *  정수형
		 *     byte, short, int, long
		 *  실수형 
		 *     float, double
		 *  논리형
		 *     boolean
		 *  문자형
		 *     char
		 */
		  Scanner sc = new Scanner(System.in);      //키보드 통해서 입력받을떄 //객체 생성(인스턴스 생성)
		  
		  System.out.println("이름을 입력하세요 :");
		  
		  String name = sc.nextLine();       //String은 기본자료형이 아니므로 참조자료형 문자열 입력받을 때 사용(int는 정수 입력시사용하므로 문자는 string이다)
		  
		  System.out.println("나의 이름은 " + name + " 입니다");
		  
		  System.out.println("혈액형을 입력하세요 :");
		  
		  String sad = sc.nextLine();
		  
		  System.out.println("혈액형은 " + sad + " 입니다");
		  
		  System.out.println("나이를 입력하세요 :");
		  
		  int age = sc.nextInt();
		  
		  System.out.println("나이는 " + age + " 입니다");
		  
		  System.out.println("출생일자를 입력하세요 :");
		  
		  int birth = sc.nextInt();
		  
		  System.out.println("출생일자는 " + birth + " 입니다");

		  System.out.println("프로그램 종료!!!");
		  
		  

	}

}
