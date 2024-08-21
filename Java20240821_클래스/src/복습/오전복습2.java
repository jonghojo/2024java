package 복습;

import java.util.Scanner;

public class 오전복습2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 수를 입력하세요:");
		
		int num = sc.nextInt();
		
		double[] com = new double[num];
		
		for(int i=0; i<com.length; i++)
			com[i] = (Math.random()*100)+1;
		
		for(int i=0; i<com.length; i++)
			System.out.printf("%d번쨰 학생의 점수 :%.1f\n", i+1, com[i]);
		
		System.out.println();
		
		for(int i=0; i<com.length; i++)
			System.out.printf("%d번쨰 학생의 점수 :%.1f\n", com.length-i, com[com.length-1-i]);
		
		double max, min;
		max = min = com[0];
		
		for(int i=0; i<com.length; i++)
			if(max < com[i])
				max = com[i];
		
		for(int i=0; i<com.length; i++)
			if(min > com[i])
				min =com[i];
		
		System.out.printf("최고점 :%.1f, 최소점: %.1f\n", max, min);
		
		double sum =0;
		for(int i=0; i<com.length; i++)
			sum += com[i];
		
		double avg = (double)sum/com.length;
		
		System.out.printf("총점 :%.1f, 평균 :%.1f\n", sum, avg);
		
		for(int i=0; i<com.length; i++) {
			for(int j=0; j<com.length-1-i; j++) {
				if(com[j] > com[j+1]) {
				double tmp = com[j];
					   com[j] = com[j+1];
					   com[j+1] =tmp;
				}
			}
		}
		
		System.out.print("출력 :");
		for(int i=0; i<com.length; i++)
			System.out.printf("%.1f ,", com[i]);

	}

}
