package ex01;

public class AddFunc {

	public static void main(String[] args) {
		
		int[] arr = add(10, "abc", 20); //인자값(넘겨주는 값), void의경우 String sum 존재X
		int sum =0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		
		System.out.println("sum :" + sum);
		
	}
	
//	static String add(int num1, int num2) { //매개변수(값을 받는자)
//		
//		double add = (double)(num1 + num2);
//		
//		return "abcd";
//	}
	
	static int[] add(int num1, String str1, int num2) { //매개변수(값을 받는자)
		
		int[] nArr = {10,20,30,40,50};
		
		return nArr;
	}
	

}
