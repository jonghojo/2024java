package ex02;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//com.length입력시 직접 수를 전체에입력하지 않아도 한번만 입력하면 된다
		System.out.println("학생의 수를 입력하세요 :");
		
		int count = sc.nextInt();
		
		System.out.printf("학생의 수 :%d명\n",count);
		
		int[] com = new int[count];
		
		System.out.printf("%d명의 점수\n",com.length);
		
		//int i = 0;
		//com[i] = (int)(Math.radom()*101);
//		for(int i=0; i < com.length; i++) {
//			com[i] = (int)(Math.random()*101);
//		}
		
		//입력
		for(int i=0; i<com.length; i++) {
//			System.out.printf("%d번째 학생의 점수를 입력하세요 :\n", i+1);
			com[i] = (int)(Math.random()*101);
		}
		
		//출력
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번쨰 학생의 점수 : %d\n", i+1, + com[i]);
			
		}
		System.out.println();
		//입력한 data 역순 출력
//		for(int i=4; i>0; i++) {
//			System.out.printf("%d번쨰 학생의 점수 : %d\n", i+1, + com[i]);
//			
//		}
		
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번쨰 학생의 점수 : %d\n", com.length-i, + com[com.length-1-i]);
			
		}
		//최대값, 최소값
		int max, min;
		max = min = com[0];
		
		for(int i=0; i<com.length; i++) {
			if(max < com[i])
				max = com[i];
				
			if(com[i] < min)
				min = com[i];	
		}
		//System.out.println("최고점 :" + max + ", 최소값 :" + min);
		System.out.printf("최고점 :%d, 최소값:%d\n",max,min);
		
		
		
		//총점과 평균
		int sum = 0;
		for(int i=0; i<com.length; i++) {
			sum += com[i];
		}
		System.out.println("총점 :" + sum);
		
		double avg = sum/com.length;
		System.out.printf("평균 :%.2f\n", avg);
		
		// int sum=0;
		// for(int i=0; i<cpm.length; i++){
		//		sum += com[i];
		// System.out.pintf("총점 :%d, 평균:%.2f\n", sum, (double)sum/com.length);
		
		//정렬-차후
		for(int i=0; i<com.length; i++) {
			
			for(int j=0; j<com.length-1-i; j++){
				if(com[j] > com[j+1]) {
					int tmp =com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		System.out.print("출력 :");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i]+ " , ");
		}
}
}