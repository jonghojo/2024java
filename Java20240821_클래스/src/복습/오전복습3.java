package 복습;

import java.util.Scanner;

public class 오전복습3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		int score = (int)(Math.random()*100)+1;
		System.out.println("점수 :" + score);
		
		switch(score/10) {
		case 1:
			System.out.println("F입니다");	
				break;
		
		case 2:
			System.out.println("F입니다");
			 	break;
		case 3:
			System.out.println("F입니다");
				break;
		case 4:
			System.out.println("F입니다");
			 	break;
		case 5:
			System.out.println("F입니다");
			 	break;
		case 6:
			System.out.println("D입니다");
			 	break;
		case 7:
			System.out.println("C입니다");
			 	break;
		case 8:
			System.out.println("B입니다");
			 	break;
		case 9:
			System.out.println("A입니다");
			 	break;
		case 10:
			System.out.println("A입니다");
			 	break;	 	
		}
		System.out.println("채점종료");
	}

}
