package ex02;

public class 산술연산자 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 7;
		
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		//int 나누기 = num1 / num2; 소수점이 아닌 정수만 표현이 됨
		//int 나누기 = num1 / (double)num2; 소수점까지 표현하기위한 식이지만 double 이 int 보다 수가 더 크기때문에 오류가난다 오류해결을위해 아래 식처럼 사용할것
		double 나누기 = num1 / (double)num2; // 오류룰 없애기 위해 식 맨 앞의 int를 double로 바꾸어서 해결한다
		
		
		int 나머지 = num1 % num2;
		
		System.out.println(더하기);
		System.out.println(빼기);
		System.out.println(곱하기);
		// System.out.println(나누기);
		System.out.printf("%d\n" , 곱하기); // %d 10진 정수
		System.out.printf("%x\n" , 곱하기); // %x 16진 정수
		System.out.printf("%o\n" , 곱하기); // %o 8진 정수
		
		System.out.printf("%f\n" , 나누기); // %f 실수 출력
		System.out.printf("%.0f\n" , 나누기); // %f 실수 출력 앞에 .x 는 소수점 아래 x의 자리수까지 출력
		
		System.out.println(나머지);
		System.out.println("----------------------------------");
		
		int num3 =12;
		int num4 =123;
		int num5 =1234;
		int num6 =12345;
		
		System.out.println(num3 + "," + num3);
		System.out.println(num4 + "," + num4);
		System.out.println(num5 + "," + num5);
		System.out.println(num6 + "," + num6);
		System.out.println("---------------------");
		
		System.out.printf("%d , %d\n", num3, num3);
		System.out.printf("%d , %d\n", num4, num4);
		System.out.printf("%d , %d\n", num5, num5);
		System.out.printf("%d , %d\n", num6, num6);
		System.out.println("------------------------");
		
		System.out.printf("%5d , %5d\n", num3, num3);
		System.out.printf("%5d , %5d\n", num4, num4);
		System.out.printf("%5d , %5d\n", num5, num5);
		System.out.printf("%5d , %5d\n", num6, num6);
		System.out.println("-------------------------");
		
		System.out.printf("%-5d , %5d\n", num3, num3);
		System.out.printf("%-5d , %5d\n", num4, num4);
		System.out.printf("%-5d , %5d\n", num5, num5);
		System.out.printf("%-5d , %5d\n", num6, num6);
		System.out.println("-------------------------");
		
		System.out.printf("%5d , %-5d\n", num3, num3);
		System.out.printf("%5d , %-5d\n", num4, num4);
		System.out.printf("%5d , %-5d\n", num5, num5);
		System.out.printf("%5d , %-5d\n", num6, num6);

		
		

	}

}
