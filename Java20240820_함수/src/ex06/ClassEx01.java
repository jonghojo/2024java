package ex06;

import java.util.Scanner;

public class ClassEx01 {//외부에 공개하겠다

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체생성
		
//		Student 철 = new Student();
//		철.나이 = 50;
//		철.이름 = "김대철";
//		철.전화번호 = "010-3380-6423";
//		철.info();
//		
//		Student 동휘 = new Student();
//		동휘.나이 = 28;
//		동휘.이름 = "이동휘";
//		동휘.전화번호 = "010-1111-2222";
//		동휘.info();
		
		bank 조 = new bank();
		조.계좌번호 = "012-330-056047";
		조.이름 = "조종호";
		조.입금();
		조.출금();
		조.info();
	}

}
//public은 1개만 존재한다
//class Student{
//	
//	String 이름;
//	int 나이;
//	String 전화번호;
//	
//	void info() {
//		System.out.printf("이름 :%s, 나이 :%d, 전화번호 :%s\n", 이름, 나이, 전화번호);
//	}
//	
//	
//	void 입실() {
//		System.out.println("입실하다");
//	}
//	
//	void 퇴실() {
//		System.out.println("퇴실하다");
//	}
//	
//	void 조퇴() {
//		System.out.println("조퇴하다");
//	}
//}

class bank{
	int 입금=0;
	int 출금=0;
	String 이름;
	String 계좌번호;
	int 잔액=0;
	Scanner sc = new Scanner(System.in);
	
	
	
	void info() {
		System.out.printf("이름 :%s, 계좌번호 :%s, 잔액 :%d\n", 이름, 계좌번호, 잔액);
	}
	
	void 입금() {
		System.out.println("입금액 :");
		입금 = Integer.parseInt(sc.nextLine());
		잔액 += 입금;
	}
	
	void 출금() {
		System.out.println("출금액 :");
		출금 = Integer.parseInt(sc.nextLine());
		잔액 -= 출금;
	}
	
	void 잔액() {
		System.out.println("잔액 :" + 잔액);
	}
	
//	void 입금(int money) {
//		잔액 += money;
//	}
//	
//	void 출금(int money) {
//		잔액 -= money;
//	}
//	
//	void 잔액() {
//		System.out.println("잔액 :" + 잔액);
//	}
//	
	
	
	
}
