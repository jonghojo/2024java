package ex02;

public class While예제 {

	public static void main(String[] args) {
		//for 몇번일지 알때, while 몇번인지 정확히 모를때(횟수를 알떄와 모를떄로 구분한다)
//		int sum = 0;
//		int i =0;
//		
//		while(i<=100) {
//			sum+=i;
//			
//			i++;
//		}
//		System.out.println(sum);
		
		int i = 2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
		}
		
	}

}
