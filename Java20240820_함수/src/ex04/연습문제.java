package ex04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		/*
		 * 1.과목등록| 2.과목목록보기 | 3.종료
		 * String배열을 이용해서 작업하기
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		int index = 0;
		boolean flag = true;
		
		while(flag) {//기본값으로 flag가 true로 반복이되지만 3번 종료를누르면 false가되기에 종료를 한다
			System.out.println("1.과목등록| 2.과목목록보기 | 3.종료");
			System.out.println("번호입력>>");
			
			int num = Integer.parseInt(sc.nextLine()); //엔터포함하여 내용챙겨가기
//			위 명령어와 아래명령어는 똑같다
//			int num = sc.nextLine(); -> 엔터 제외하고 내용만 가져가기(엔터가 남아있다)
//			sc.nextLine(); -> 엔터제거
			
			
			switch(num) {
				case 1:
					System.out.println("과목명 입력>>");
					name[index++] = sc.nextLine();
//					아래두줄과 위에한줄 명령어는 똑같다
// 					name[index] = sc.nextLine(); 
//					index++;
					break;
				case 2:
					for(int i=0; i<index; i++) //기본적으로 이름이 배정받은 방은 n개이지만 index가 들어가는경우 입력한 갯수만큼만 출력하게 된다
						System.out.print(name[i] + ", ");
					System.out.println();
					break;
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
