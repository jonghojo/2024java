package ex05;

import java.util.Scanner;

public class operation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		double time = (Math.random()*10.0);
//		
//		int fee = 1000;
//		
//		double rate = 0;
//		
//		if(time <= 1.0) {
//			rate = 1;
//		}
//		else if(time <=2.0) {
//			rate = 2;
//		}
//		else if(time <=3.0) {
//			rate = 3;
//		}
//		else if(time > 3.0) {
//			rate = 5;
//		}
//		
//		int result = (int)(fee*rate);
//		System.out.printf("주차 시간 : %.1f, 주차 비용 : " + "%d원", (double)time, result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주차 시간을 입력하세요 (시간 단위)");
	    int fee = 0;
	    double hours = sc.nextDouble();
	    
	    if(hours>3) {
	    	fee = 5000;
	    }
	    else if(hours>2) {
	    	fee = 2000;
	    }
	    else if(hours>1) {
	    	fee = 1000;
	    }
	    
	    
	    System.out.printf("주차시간 : %.1f시간 , 주차 요금은 %d원입니다.", hours, fee);
	    
	    
	

	}

}
