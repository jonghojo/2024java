package ex01;

public class 증감연산자 {

	public static void main(String[] args) {
		// 증감 연산자 => 선위연산자, 후위연산자
		// 선위 연산자 = 연산후 적용, 후위 연산자 = 적용후 연산 
		
		int num = 0;
		
		//num = num + 1; //간략하게 ++num
		++num;	//선위
		num++;  //후위
		--num;
		
		System.out.println(num);

	}

}
