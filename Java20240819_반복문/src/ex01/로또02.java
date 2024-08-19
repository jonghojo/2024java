package ex01;

import java.util.Random;
import java.util.Scanner;

public class 로또02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[45]; //45개의 방 개설
		int count = 0;
		Random random = new Random();
		for(int i=0; i<45; i++) //1~45까지의 랜덤숫자 대입
			lotto[i] = i+1; //(0~44)+1
		
		for(int j=0; j<5; j++) {//로또 게임 5개 만들기
		
		for(int i=0; i<45; i++) { //배열 섞기
			int index = random.nextInt(45);
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
		}
		
		for(int k=0; k<6; k++)
			System.out.print(lotto[k] + " ");
		System.out.println();
	}
		
 }
	
}


