package ex01;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] nArr = new int[5];
		
		//배열 자체의 초기화 -> 값 의 범위 1 ~ 100 =>랜덤함수 이용
		for(int i=0; i<nArr.length; i++) 
		nArr[i] =(int)(Math.random()*100)+1;
		
		for(int i=0; i<nArr.length; i++)
			System.out.print(nArr[i] + " , ");
		
		//최대값 , 최소값
		//if문에는 ; 사용X
		System.out.println();
		int max , min;
		max =min =nArr[0];
//		for(int i=0; i<5; i++) {
//			if(nArr[i] > max)
//			max = nArr[i];
//		}
//		System.out.println("최대값 :" + max);
//		
//		for(int i=0; i<5; i++) {
//			if(nArr[i] < min)
//				min = nArr[i];
//		}
//		System.out.println("최소값 :" + min);
//	
		for(int i=0; i<nArr.length; i++) {
			if(max < nArr[i]) max=nArr[i];
			
			if(min > nArr[i]) min=nArr[i];
		}
		System.out.printf("최대값 :%d, 최소값 :%d", max, min);
		//총점, 평균
		int sum = 0;
		
		for(int i=0; i<nArr.length; i++) 
			sum += nArr[i];
		
		System.out.printf("\n총점: %d, 평균: %.2f\n", sum, (double)sum/nArr.length);
		//정렬(이중 for)
		for(int i=0; i<nArr.length; i++) {
			for(int j=0; j<nArr.length-1; j++) {
				if(nArr[j] > nArr[j+1]) {
					int tmp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = tmp;
				}
//				int tmp = nArr[j];
//				nArr[j] = nArr[j-1];
//				nArr[j-1] = tmp;
			}
		}
		for(int i=0; i<nArr.length; i++)
			System.out.print(nArr[i] + " , ");
}
}
