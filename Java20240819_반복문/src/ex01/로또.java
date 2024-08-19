package ex01;

import java.util.Random;
import java.util.Scanner;

public class 로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		Random random = new Random();
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<6; j++) 
			{
				int tmp = random.nextInt(45)+1;// 1~45까지의 랜덤숫자 뽑아서 빈방에 넣기
			
				
					for(int k=0; k<j; k++) 
					{ //같은숫자 중복체크
						System.out.println(j + " , " + k);
						if(lotto[k] == tmp)
						{
//						    System.out.print("{중복 " + j + "}");
							j--;
							break;
						}
					}
					//if(flag == false) {
					lotto[j] = tmp;
//					System.out.printf(lotto[j] + ", ");
					}
			System.out.println();
			}
			
		}
		
//		System.out.println(random.nextInt(45)+1);
		
//		for(int i=1; i<lotto.length; i++)
//			lotto[i] = (int)(Math.random()*45)+1;
//		
//		for(int i=1; i<lotto.length; i++)
//			System.out.print(lotto[i] + ", ");
			
	}


