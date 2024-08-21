package Ex01;

import java.util.Scanner;

public class ClassEx01 {//외부에 공개하겠다

	public static void main(String[] args) {
		// private < default < protected < public
		// private -> 같은 클래스 내에서만
		// default -> 같은 패키지 내에서만 공개
		// protected -> 다른 패키지에서도 상속하면 공개
		// public -> 모두공개
		Scanner sc = new Scanner(System.in); // 객체생성
		
		Student 철 = new Student();
		철.나이 = 50;
		철.이름 = "김대철";
		철.전화번호 = "010-3380-6423";
		/*
		 * 멤버변수는 외부공개X
		 * 그러면
		 * int a;
		 * a=10;
		 * system.ou.println(a); -> 즉, a변수를 초기화해야 사용가능
		 * 마찬가지로 멤버변수를 초기화 해야한다
		 * 초기화 하는 방법은 2가지
		 * 1, 생성자, 2.
		 */
		철.info();
		
		Student 동휘 = new Student();
		동휘.나이 = 28;
		동휘.이름 = "이동휘";
		동휘.전화번호 = "010-1111-2222";
		동휘.info();
		
	}

}
//public은 1개만 존재한다

class Student{
	
	String 이름;
	int 나이;
	String 전화번호;
	
	void info() {
		System.out.printf("이름 :%s, 나이 :%d, 전화번호 :%s\n", 이름, 나이, 전화번호);
	}
	
	void 입실() {
		System.out.println("입실하다");
	}
	
	void 퇴실() {
		System.out.println("퇴실하다");
	}
	
	void 조퇴() {
		System.out.println("조퇴하다");
	}
}
