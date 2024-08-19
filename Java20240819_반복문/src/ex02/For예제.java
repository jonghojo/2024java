package ex02;

public class For예제 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i ;
		}
		System.out.println(sum);
		
		for(int i=2; i<9; i++)
			for(int j=1; j<9; j++)
				System.out.printf("%d X %d = %d\n", i, j, i*j);

	}

}
