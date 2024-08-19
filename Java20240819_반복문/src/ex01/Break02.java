package ex01;

public class Break02 {

	public static void main(String[] args) {
		int i=2;
		for(; i<=9; i++) {
			int j=1;
			for(; j<=9; j++) {
				
				System.out.printf("%d X %d = %d\n", i, j, i*j);
				
				if(i == j) break;
			}
			System.out.println("-------------------------");
		}

	}

}
