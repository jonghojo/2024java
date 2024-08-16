package ex02;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//[]등어가야 nArr 사용한거다
		int[] com = new int[5];
		//점수 표시-1
//		for(int i=0; i<5; i++) {
//			System.out.print(com[i] +",");
		
		
		//최대값 계산
		
		//점수 입력창
//		for(int i=0; i<5; i++) {
//			System.out.printf("%d번째 학생 com점수 입력 :", i+1);
//			com[i] = sc.nextInt();
//		}
//		//점수 표시-2
//		for(int i=0; i<5; i++) {
//			System.out.printf("%d번째 학생 점수:%d\n", i+1, + com[i]);
//		}
//		//max값 구하는 방법
//		int max = 0;
//		for(int i=0; i<5; i++) {
//			if(com[i] > max);{
//				max = com[i];
//			}
//		}
//		System.out.println("최고점수 :" + max);
		
		//총점과 평균
		
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번째 학생의 com점수 입력", i+1);
			com[i] = sc.nextInt();
		}
		
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번째 학생 점수:%d\n", i+1, + com[i]);
		}
		
		//총점
		int all = 0;
		for(int i=0; i<com.length; i++) {
			all += com[i];
		}
			System.out.println("총점 :" + all);
		
		//평균
		double avg = all/com.length;
		System.out.printf("평균 :%.2f\n", avg);
		//%d는 정수로받을떄 %f는 실수로 받을때
	}

}
