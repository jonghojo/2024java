package ex01;

public class AddFunc3 {

	public static void main(String[] args) {
		
		//정수 값 10넘겨주면 전달하면 함수에서 1!10까지 합의 평균을 구해서 리턴시킨다
		
		double result = func(100);//1번
		
		System.out.println(result);
		
		
		int num =10; // 기본자료형
		int[] nArr = {1,2,3,4,5,6}; // 참조형
	}
	
	
	static double func(int n) {//2번
		
		int sum = 0;//3번
		
		for(int i=1; i<=n; i++) 
			sum += i;
		
		return (double)sum/n;
	}
	//3번이 double일경우 1번과 2번도 무조건 double사용 1번과 2번은 한쌍으로 생각하고 3번은 작은수를 사용해도 문제가없지만 위쪽에있는 1번과 2번은 3번보다 작을수는 없다

}
