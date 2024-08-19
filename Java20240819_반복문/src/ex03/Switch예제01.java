package ex03;

public class Switch예제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =(int)(Math.random()*12)+1;
		System.out.println("n :"+ n);
		//default는 if문에서의 else와 같은역활을 한다
		//break는 해당 문단을 종료할때사용
//		switch(n) {
//		case 0: // 정수와 문자열 가능
//			System.out.println("0000000000");
//			break;
//		case 1:
//			System.out.println("111");
//			break;
//		case 2:
//			System.out.println("222");
//			break;
//		case 3:
//			System.out.println("333");
//			break;
//		case 4:
//			System.out.println("444");
//			break;
//			default:
//				System.out.println("그 외 값");
//		}
		
		switch(n) {
		case 12: // 정수와 문자열 가능
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}

	}

}
